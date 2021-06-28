package com.example.store.controller;

import com.example.store.model.Item;
import com.example.store.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> get() {
        return this.itemService.findAll();
    }

    @GetMapping("{id}")
    public Item get(@PathVariable final int id) {
        return this.itemService.findBy(id);
    }

    @PostMapping
    public int post(@RequestBody final Item item) {
        return this.itemService.create(item);
    }

    @PutMapping("{id}")
    public void put(@PathVariable final int id, @RequestBody final Item item) {
        item.id = id;
        this.itemService.modify(item);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable final int id) {
        this.itemService.removeBy(id);
    }
}
