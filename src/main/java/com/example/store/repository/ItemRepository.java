package com.example.store.repository;

import com.example.store.model.Item;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class ItemRepository {
    public List<Item> findAll() {
        return Collections.emptyList();
    }
}
