package com.example.store.repository;

import com.example.store.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    List<Item> selectAllItems();

    void insertItem(final Item item);
}
