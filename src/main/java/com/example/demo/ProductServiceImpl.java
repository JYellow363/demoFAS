package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(int id) {
		return productRepository.findById(id).get();
	}

	@Override
    @Transactional
	public void insert(Product product) {
		productRepository.save(product);		
	}

	@Override
    @Transactional
	public void delete(int id) {
		productRepository.deleteById(id);
	}

	@Override
    @Transactional
	public void update(Product product) {
		productRepository.save(product);	
	}

}
