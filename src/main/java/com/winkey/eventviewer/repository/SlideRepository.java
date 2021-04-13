package com.winkey.eventviewer.repository;

import com.winkey.eventviewer.model.SlideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlideRepository extends JpaRepository<SlideEntity, Integer> {
}
