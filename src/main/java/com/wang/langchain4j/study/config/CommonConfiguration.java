package com.wang.langchain4j.study.config;

import com.wang.langchain4j.study.manager.AiCodeHelperService;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CommonConfiguration {

    @Value("${langchain4j.community.dashscope.chat-model.model-name}")
    private String modelName;

    @Value("${langchain4j.community.dashscope.chat-model.api-key}")
    private String apiKey;

    @Value("${langchain4j.memory.message.maxCount}")
    private int memoryMessageMaxCount;

    @Bean
    public ChatModel myQwenChatModel() {
        return QwenChatModel.builder()
                .apiKey(apiKey)
                .modelName(modelName)
                .enableSearch(true)
                .temperature(0.7F)
                .maxTokens(4096)
                .stops(List.of("Hello"))
                .build();
    }

    @Bean
    public ChatMemory chatMemory() {
        return MessageWindowChatMemory.withMaxMessages(memoryMessageMaxCount);
    }

//    @Bean
//    public AiCodeHelperService aiCodeHelperService(ChatModel myQwenChatModel) {
//        return AiServices.create(AiCodeHelperService.class, myQwenChatModel);
//    }

}
