package com.wang.langchain4j.study.manager;

import com.wang.langchain4j.study.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QwenModelServiceTest extends BaseTest {

    @Autowired
    private QwenModelService qwenModelService;

    @Test
    public void testChat() {
//        String message = "Hello, i am WangChunsheng, some girl my never know i love her, or she is pretend to blind";
        String message = "hello, 我是一个36岁的男人";
        System.out.println(qwenModelService.chat(message));
    }

}
