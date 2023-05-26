package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User addUser(User user);

    void deleteUserById(Long id);
}
