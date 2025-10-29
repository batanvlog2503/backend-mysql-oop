package com.ptit.blog.service;

import com.ptit.blog.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();
    User getUserById(int id);
    void createUser(User user);
}
