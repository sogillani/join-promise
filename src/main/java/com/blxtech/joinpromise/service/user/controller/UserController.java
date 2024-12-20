package com.blxtech.joinpromise.service.user.controller;

import com.blxtech.joinpromise.service.user.dto.UserDTO;
import com.blxtech.joinpromise.service.user.mapper.UserMapper;
import com.blxtech.joinpromise.service.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> userDTOS = userService.getUsers()
                .stream()
                .map(UserMapper::toDTO).toList();
        return ResponseEntity.ok(userDTOS);
    }

}
