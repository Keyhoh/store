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

    public Item findBy(final int id) {
        return this.itemMapper.selectItem(id);
    }

    public int create(final Item item) {
        this.itemMapper.insertItem(item);
        return item.id;
    }

    public void modify(final Item item) {
        this.itemMapper.updateItem(item);
    }

    public void removeBy(final int id) {
        this.itemMapper.deleteItem(id);
    }
}
