package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}