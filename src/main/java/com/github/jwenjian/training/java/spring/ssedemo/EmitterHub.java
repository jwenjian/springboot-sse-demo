package com.github.jwenjian.training.java.spring.ssedemo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class EmitterHub {
    private final ConcurrentHashMap<String, SseEmitter> HUB = new ConcurrentHashMap<>(16);

    public void registerEmitter(final String uid, final SseEmitter emitter) {
        HUB.put(uid, emitter);
    }

    public boolean isEmpty() {
        return HUB.isEmpty();
    }

    public Collection<SseEmitter> allEmitters() {
        return HUB.values();
    }

}
