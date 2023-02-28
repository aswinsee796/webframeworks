package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Books")
@Entity
public class Book {
@Id
@Column(name="ID")
@GeneratedValue
private int id; 
@Column(name="NAME")
private String name;
@Column(name="AUTHOR")
private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author=author;
}
public Book(int id,String name,String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}
public Book(){
	
}
}
