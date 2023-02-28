package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Book;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
@Autowired
private  BookService bkservice;
@GetMapping("/getBook")
public List<Book> getDetails(){
	return bkservice.getAllDetails();
}
@PostMapping("/addBook")
public Book postDetails(@RequestBody Book  b) {
	return bkservice.saveDetails(b);
}
@DeleteMapping("/delete/{id}")
public void delete(int id) {
	bkservice.deleteDepartmentById(id);
}
@PutMapping("updateBook/{id}")
public Book update(@PathVariable int id,@RequestBody Book b) {
	return bkservice.update(id, b);
}


}
