package com.bozkurt.todolist.service;

import com.bozkurt.todolist.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findById(long id);
    List<User> findAll();
}
