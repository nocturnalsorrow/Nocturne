package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Manufacturer;
import com.nocturne.nocturne.model.User;
import com.nocturne.nocturne.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty())
            throw new IllegalStateException("User with id " + id + " doesn`t exist");
        return userOptional.get();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
