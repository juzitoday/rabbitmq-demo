package com.example.rabbitdemo;

import com.example.rabbitdemo.spring.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitDemoApplicationTests {

    @Autowired
    Producer producer;

    @Test
    void contextLoads() {
        producer.send();
    }

}
