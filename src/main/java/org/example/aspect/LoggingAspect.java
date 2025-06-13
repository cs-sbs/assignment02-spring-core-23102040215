package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.service.OrderService.createOrder(..))")
    public void beforeCreateOrder() {
        System.out.println("Before creating an order, logging...");
    }
}