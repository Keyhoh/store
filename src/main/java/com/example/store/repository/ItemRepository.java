package com.example.store.repository;

import com.example.store.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository {
    private final ItemMapper itemMapper;

    public ItemRepository(final ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    public List<Item> findAll() {
        return this.itemMapper.selectAllItems();
    }
}
