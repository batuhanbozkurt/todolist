package com.bozkurt.todolist.dao;

import com.bozkurt.todolist.model.ListItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListItemDao extends CrudRepository<ListItem, Long>{
}
