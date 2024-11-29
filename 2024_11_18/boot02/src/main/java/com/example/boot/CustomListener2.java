package com.example.boot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener2 implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Application Started");

    }
}
