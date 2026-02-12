package com.wang.langchain4j.study.manager;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(chatMemory = "chatMemory", wiringMode = AiServiceWiringMode.EXPLICIT, chatModel = "myQwenChatModel")
public interface AiCodeHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);

    String littleChat(String userMessage);
}
