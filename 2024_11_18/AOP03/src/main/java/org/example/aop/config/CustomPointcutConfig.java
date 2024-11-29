package org.example.aop.config;

import org.aspectj.lang.annotation.Pointcut;

public class CustomPointcutConfig {

    // 기존
    @Pointcut("execution(public * say*(..))")
    public void myTarget() {

    }

    @Pointcut("bean(*todo*)")
    public void myTodo() {

    }
}
