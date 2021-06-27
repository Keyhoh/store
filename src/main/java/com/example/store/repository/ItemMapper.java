package com.example.store.repository;

import com.example.store.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    public List<Item> selectAllItems();
}
