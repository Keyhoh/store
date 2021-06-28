package com.example.store.repository;

import com.example.store.model.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface CustomerMapper {
    List<Customer> selectAllCustomers();
}
