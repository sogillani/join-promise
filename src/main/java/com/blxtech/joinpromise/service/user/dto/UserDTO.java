package com.blxtech.joinpromise.service.user.dto;

import java.time.Instant;
import java.util.UUID;

public record UserDTO(
        UUID userId,
        String name,
        String email,
        String password,
        String phone,
        Instant createdAt,
        Instant updatedAt
) {
}
