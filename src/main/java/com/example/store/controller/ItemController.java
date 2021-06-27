package com.example.store.controller;

import com.example.store.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("item")
public class ItemController {
    @GetMapping
    public List<Item> get() {
        return Collections.emptyList();
    }
}
