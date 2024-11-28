package com.blxtech.joinpromise.service.user.service;

import com.blxtech.joinpromise.service.user.model.User;
import com.blxtech.joinpromise.service.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
