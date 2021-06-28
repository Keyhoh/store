package com.example.store.repository;

import com.example.store.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface OrderMapper {
    List<Order> selectAllOrders();
}
