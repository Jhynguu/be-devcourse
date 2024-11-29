package org.example.aop.model;

import org.springframework.stereotype.Service;

@Service("target")
public class TargetService implements Target {

    // 핵심사항
    @Override
    public String sayEcho(String name) {
        System.out.println("sayEcho(String name) 호출");
        return "Hi " + name;
    }

    @Override
    public String sayEcho1(String name) {
        System.out.println("sayEcho1(String name) 호출");
        return "안녕 " + name;
    }

    @Override
    public String sayEcho2(String name) {
        System.out.println("sayEcho2(String name) 호출");
        return "Hello " + name;
    }
}
