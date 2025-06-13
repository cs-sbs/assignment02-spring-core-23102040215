package org.example.service;

import org.example.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderDao orderDao;

    @Autowired
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder() {
        System.out.println("Creating a new order...");
        orderDao.saveOrder();
    }
}