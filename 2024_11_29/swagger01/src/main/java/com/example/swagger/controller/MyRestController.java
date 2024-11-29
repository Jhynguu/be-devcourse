package com.example.swagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    /*@RequestMapping("request")
    public String request() {
        return "Hello World";
    }*/

    @GetMapping("/get")
    public String get() {
        return "Hello World";
    }

    @GetMapping("/get/{id}")
    public String getId(@PathVariable int id) {
        return "Hello World : " + id;
    }

    @PostMapping("/post")
    public String post(String data1, String data2) {
        return "Hello World : " + data1 + data2;
    }
}
