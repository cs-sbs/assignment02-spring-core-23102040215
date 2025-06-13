package org.example;

import org.example.config.AppConfig;
import org.example.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext; // 添加必要的导入

public class Main {
    public static void main(String[] args) { // 移除错误的泛型声明
        // 创建 Spring 应用上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取 OrderService Bean（修正方法调用）
        OrderService orderService = context.getBean(OrderService.class); // 使用 getBean 方法

        // 调用业务方法
        orderService.createOrder();

        // 关闭上下文
        context.close();
    }
}