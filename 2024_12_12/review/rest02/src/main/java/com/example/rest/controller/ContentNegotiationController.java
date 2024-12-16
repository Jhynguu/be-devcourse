package com.example.rest.controller;

import com.example.rest.dto.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentNegotiationController {

    // 텍스트 응답
    @GetMapping(value = "/text", produces = MediaType.TEXT_PLAIN_VALUE)
    public String text() {
        return "This is plan text!";
    }

    // JSON 응답
    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getJson() {
        return new User(1, "홍길동", "hong@example.com");
    }

    // XML 응답
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public User getXml() {
        return new User(2, "이몽룡", "lee@example.com");
    }

}
