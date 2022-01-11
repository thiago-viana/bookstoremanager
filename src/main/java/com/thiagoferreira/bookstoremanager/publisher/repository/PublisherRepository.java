package com.thiagoferreira.bookstoremanager.publisher.repository;

import com.thiagoferreira.bookstoremanager.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
