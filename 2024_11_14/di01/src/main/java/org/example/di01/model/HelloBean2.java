package org.example.di01.model;

public class HelloBean2 {

    public HelloBean2() {
        System.out.println("HelloBean1 생성자 호출");
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
