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

    @PostMapping
    public int post(@RequestBody final Item item){
        return this.itemService.create(item);
    }
}
