package com.dao;

import com.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    List<User> list();
}
