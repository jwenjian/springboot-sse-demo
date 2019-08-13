package com.github.jwenjian.training.java.spring.ssedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.time.LocalTime;

@Component
public class EventTrigger implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(EventTrigger.class);


    @Autowired
    private EmitterHub emitterHub;


    @Override
    public void run(String... args) throws Exception {
        while (true) {
            Thread.sleep(3000);

            if (emitterHub.isEmpty()) {
                continue;
            }

            for (SseEmitter sseEmitter : emitterHub.allEmitters()) {
                try {
                    sseEmitter.send("SSE MVC - " + LocalTime.now().toString());
                } catch (Exception e) {
                    logger.error("Failed to send message to emitter", e);
                }
            }
        }
    }

}
