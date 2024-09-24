package com.systex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.systex.demo.model.IProduct;
import com.systex.demo.model.Product;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	
	@Autowired 
	private Product product;
	
	public static void main(String[] args) {
		System.out.println("start Boot Application");
		SpringApplication.run(DemoApplication.class, args);
        System.out.println("End SPring Boot");
	}
//	@Bean
//	public Product abc() {
//		Product p = new Product();
//		p.setId(1001);
//		p.setName("iphone 16");
//		p.setDescription("Coming soon");
//		return p;
//	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		ApplicationContext container = new AnnotationConfigApplicationContext(DemoApplication.class);
//		Product product = container.getBean(Product.class);
//		System.out.println(product);
//		
		System.out.println(product.getDescription());
	}
	

}
