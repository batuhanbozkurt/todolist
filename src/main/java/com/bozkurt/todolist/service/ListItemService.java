package com.bozkurt.todolist.service;

import com.bozkurt.todolist.model.ListItem;

import java.util.List;

public interface ListItemService {
    void save(ListItem listItem);
    ListItem findById(long id);
    List<ListItem> findAll();
    void delete(long id);
}
