package org.example.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@Aspect
public class BasicAdvice2 {

    //@Pointcut("execution(public * say*(..))")
    @Pointcut("execution(public * says*(..))")
    public void myTarget() {
    }

    @Around("myTarget()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        Object obj = null;

        System.out.println("전처리 구간 2");

        // 핵심 사항 실행
        obj = joinPoint.proceed();

        System.out.println("후처리 구간 2");

        return obj;
    }
}
