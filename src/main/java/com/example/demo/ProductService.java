package com.example.demo;

import java.util.List;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	void insert(Product product);
	void delete(int id);
	void update(Product product);
	
}
