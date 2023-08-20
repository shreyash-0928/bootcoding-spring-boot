package com.couponsystem.service;

import com.couponsystem.model.User;
import com.couponsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void saveUser(List<User> users) {
        for (User user : users) {
            userRepository.save(user);
        }
    }
}
