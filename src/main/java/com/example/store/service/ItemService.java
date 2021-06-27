package com.example.store.service;

import com.example.store.model.Item;
import com.example.store.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(final ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return Collections.unmodifiableList(this.itemRepository.findAll());
    }
}
