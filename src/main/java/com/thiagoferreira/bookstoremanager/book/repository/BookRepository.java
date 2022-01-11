package com.thiagoferreira.bookstoremanager.book.repository;

import com.thiagoferreira.bookstoremanager.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
