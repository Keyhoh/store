package com.example.store.repository;

import com.example.store.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface ItemMapper {
    List<Item> selectAllItems();

    Item selectItem(final int id);

    void insertItem(final Item item);

    void updateItem(final Item item);
}
