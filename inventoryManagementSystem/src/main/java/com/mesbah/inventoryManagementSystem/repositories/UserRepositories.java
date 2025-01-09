package com.mesbah.inventoryManagementSystem.repositories;

import com.mesbah.inventoryManagementSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
