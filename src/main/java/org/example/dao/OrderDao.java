package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
    public void saveOrder() {
        System.out.println("Saving order to database...");
    }
}