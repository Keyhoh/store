package com.example.store.service;

import com.example.store.model.Order;
import com.example.store.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return Collections.unmodifiableList(this.orderRepository.findAll());
    }
}
