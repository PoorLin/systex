package com.systex.testJDBC.lab3;

import java.util.List;

public interface ProductDao {
	public Product getProduct(int id);
	
	public List<Product> gProducts();
	
	public int insert(Product product);
	
	public void update(Product product);

}
