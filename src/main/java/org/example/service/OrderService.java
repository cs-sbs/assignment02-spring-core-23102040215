package org.example.service;

import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void createOrder(){
        System.out.println("正在处理订单业务逻辑...");
        orderRepository.saveOrder();
    }
}
