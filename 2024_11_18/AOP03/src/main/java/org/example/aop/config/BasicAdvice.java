package org.example.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BasicAdvice {

    //@Around("org.example.aop.config.CustomPointcutConfig.myTarget()")
    @Around("org.example.aop.config.CustomPointcutConfig.myTodo()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object obj = null;

        System.out.println("전처리 구간");

        obj = pjp.proceed();

        System.out.println("후처리 구간");
        return obj;
    }
}
