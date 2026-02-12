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

}
