package com.example.store.service;

import com.example.store.model.Customer;
import com.example.store.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return Collections.unmodifiableList(this.customerRepository.findAll());
    }
}
