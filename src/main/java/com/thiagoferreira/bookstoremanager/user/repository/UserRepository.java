package com.thiagoferreira.bookstoremanager.user.repository;

import com.thiagoferreira.bookstoremanager.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
