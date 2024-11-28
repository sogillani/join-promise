package com.blxtech.joinpromise.service.user.repository;

import com.blxtech.joinpromise.service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
