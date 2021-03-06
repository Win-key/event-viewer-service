package com.winkey.eventviewer.repository;

import com.winkey.eventviewer.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Venkatesh Rajendran
 */

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String userName);
}
