package com.bozkurt.todolist.dao;

import com.bozkurt.todolist.model.UserList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserListDao extends CrudRepository<UserList, Long>{
}
