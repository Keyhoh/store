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

    public Item findBy(final int id) {
        return this.itemRepository.findBy(id);
    }

    public int create(final Item item) {
        return this.itemRepository.create(item);
    }

    public void modify(final Item item) {
        final Item target = this.itemRepository.findBy(item.id);
        if (item.name != null) {
            target.name = item.name;
        }
        if (item.price != null) {
            target.price = item.price;
        }
        this.itemRepository.modify(target);
    }
}
