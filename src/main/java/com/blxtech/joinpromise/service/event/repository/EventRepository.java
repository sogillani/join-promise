package com.blxtech.joinpromise.service.event.repository;

import com.blxtech.joinpromise.service.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
