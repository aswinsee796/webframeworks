package com.example.demo.DatabaseExample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface bookrepo extends JpaRepository<Book, Integer> {

}
