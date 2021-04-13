package com.winkey.eventviewer.repository;

import com.winkey.eventviewer.model.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Integer> {
}
