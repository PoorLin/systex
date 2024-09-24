package com.systex.testJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.systex.testJDBC.lab3.Product;
import com.systex.testJDBC.lab3.ProductDaoImpl;

@SpringBootApplication
public class TestJdbcApplication implements CommandLineRunner{

	@Autowired
	private ProductDaoImpl productDaoImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(		productDaoImpl.gProducts());
//		System.out.println(		productDaoImpl.getProduct(1));
		Product product = new Product();
		product.setProductId(3);
		product.setDescription("test2");
		product.setName("h2");
		productDaoImpl.update(product);
		System.out.println();
		
		
	}

}
