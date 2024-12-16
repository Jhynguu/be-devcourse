package com.example.rest.controller;

import com.example.rest.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    // 단순 문자열 응답
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    // JSON 객체 응답
    @GetMapping("/user")
    public User getUser() {
        return new User(1, "홍길동", "hong@example.com");
    }
}
