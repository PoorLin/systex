package com.systex.demo.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Product2 implements Serializable, IProduct {
	private int id;
	private String name;
	private int price;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product2(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product2 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Product2() {
		super();
	}

	@PostConstruct
	public void init() {
		this.id = 50;
		this.name = "iphone";
		this.price = 5000;

	}
}
