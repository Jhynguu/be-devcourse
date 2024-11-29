package com.example.boot;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

// ApplicatioNStartingEvenet - 프로그램 시작되면
public class CustomListener1 implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Application 시작");

    }
}

