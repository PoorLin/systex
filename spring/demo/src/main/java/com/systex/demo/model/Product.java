package com.systex.demo.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
@Component
public class Product implements Serializable,IProduct{
  private int id;
  private String name;
  private String description;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Product(int id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
}
  
@PostConstruct
public void init() {
	this.id = 50;
    this.name = "iphone";
    this.description = "this phone";
}
  
	
	
}
