package org.example.di02;

import org.example.di.HelloBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

// 전체에 쓰면 별로 안 좋음 ,,, 왜 ?
// @Scope(value = "prototype")
public class BeanConfig {

    @Bean
    @Scope(value = "prototype")
    public HelloBean1 helloBean1() {
        return new HelloBean1();
    }

    @Bean
    public HelloBean1 helloBean2() {
        return new HelloBean1();
    }
}
