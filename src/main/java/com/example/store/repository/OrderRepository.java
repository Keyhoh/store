package com.example.store.repository;

import com.example.store.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {
    private final OrderMapper orderMapper;

    public OrderRepository(final OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Order> findAll() {
        return this.orderMapper.selectAllOrders();
    }
}
