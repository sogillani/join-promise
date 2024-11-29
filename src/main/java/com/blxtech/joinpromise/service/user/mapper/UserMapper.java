package com.blxtech.joinpromise.service.user.mapper;

import com.blxtech.joinpromise.service.user.dto.UserDTO;
import com.blxtech.joinpromise.service.user.model.User;

public class UserMapper {

    private UserMapper() {}

    public static UserDTO toDTO(User user) {
        return new UserDTO(user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getPhone(),
                user.getCreatedAt(),
                user.getUpdatedAt());
    }
}
