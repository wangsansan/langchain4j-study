package com.wang.langchain4j.study.manager;

import com.wang.langchain4j.study.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AiCodeHelperServiceTest extends BaseTest {

    @Autowired
    private AiCodeHelperService aiCodeHelperService;

    @Test
    public void testChat() {
        System.out.println(aiCodeHelperService.chat("我是宁雅姝"));
    }

    @Test
    public void testChatWithMemory() {
        System.out.println(aiCodeHelperService.littleChat("我是王春生，我喜欢宁雅姝"));
        System.out.println(aiCodeHelperService.littleChat("你好，我是谁？我喜欢谁？"));
    }

}
