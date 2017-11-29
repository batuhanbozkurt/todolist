package com.bozkurt.todolist.service;

import com.bozkurt.todolist.dao.ListItemDao;
import com.bozkurt.todolist.model.ListItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListItemServiceImpl implements ListItemService {

    final ListItemDao listItemDao;

    ListItemServiceImpl(ListItemDao listItemDao) {
        this.listItemDao = listItemDao;
    }

    @Override
    public void save(ListItem listItem) {
        listItemDao.save(listItem);
    }

    @Override
    public ListItem findById(long id) {
        return listItemDao.findOne(id);
    }

    @Override
    public List<ListItem> findAll() {
        return (List) listItemDao.findAll();
    }

    @Override
    public void delete(long id) {
        listItemDao.delete(id);
    }
}
