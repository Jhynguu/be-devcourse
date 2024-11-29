package org.example.aop.model;

import org.springframework.stereotype.Service;

@Service
public class HelloBean implements com.example.aop.model.Hello {

    // 핵심 사항
    @Override
    public void sayHello() {
        System.out.println("메서드 시작");

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("결과 : " + sum);

        System.out.println("메서드 끝");
    }
}
