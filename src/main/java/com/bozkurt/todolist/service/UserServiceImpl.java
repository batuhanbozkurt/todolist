package com.bozkurt.todolist.service;

import com.bozkurt.todolist.dao.UserDao;
import com.bozkurt.todolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    final UserDao userDao;

    UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findById(long id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return (List)userDao.findAll();
    }
}
