package org.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@Aspect
public class BasicAdvice1 {

    @Pointcut("execution(public * say*(..))")
    //@Pointcut("execution(public * say*(..))")
    public void myTarget() {
    }

    /*
    @Around("myTarget()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        Object obj = null;

        System.out.println("전처리 구간");

        // 핵심 사항 실행
        obj = joinPoint.proceed();

        System.out.println("후처리 구간");

        return obj;

    }
     */

    @Before("myTarget()")
    public void before(JoinPoint joinPoint) {
        System.out.println("전처리" + joinPoint.getSignature().getName());

    }

    @After("myTarget()")
    public void after(JoinPoint joinPoint) {
        System.out.println("후처리" + joinPoint.getSignature().getName());
    }
}
