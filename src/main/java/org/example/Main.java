package org.example;


import org.example.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder();
        context.close();
    }
}