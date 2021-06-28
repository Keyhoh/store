package com.example.store.repository;

import com.example.store.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {
    private final CustomerMapper customerMapper;

    public CustomerRepository(final CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public List<Customer> findAll() {
        return this.customerMapper.selectAllCustomers();
    }
}
