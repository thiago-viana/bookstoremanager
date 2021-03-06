package com.thiagoferreira.bookstoremanager.author.repository;

import com.thiagoferreira.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
