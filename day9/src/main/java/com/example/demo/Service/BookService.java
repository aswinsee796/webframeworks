package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DatabaseExample.bookrepo;
import com.example.demo.entity.Book;

@Service
public class BookService {
@Autowired
private bookrepo brep;
public Book saveDetails(Book b) {
	return brep.save(b);
}
public List<Book> getAllDetails(){
	return brep.findAll();
}
public void deleteDepartmentById(int id) {
	brep.deleteById(id);
}
public Book update(int id, Book b) {
	return brep.save(b);
}
}
