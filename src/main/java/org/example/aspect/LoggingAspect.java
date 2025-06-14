package org.example.aspect;

public class LoggingAspect {
    public void beforeAdvice(){
        System.out.println("[AOP] 开始执行方法");
    }
    public void afterAdvice(){
        System.out.println("[AOP] 方法执行完毕");
    }
}
