package com.example.basic_structure.service;

import com.example.basic_structure.model.Product;
import com.example.basic_structure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product add(Product product){
		return productRepository.save(product);
	}

	public List<Product> addAll(List<Product> products){
		return productRepository.saveAll(products);
	}

	public Product findById(Long id){
		return productRepository.findById(id).orElseThrow();
	}

	public List<Product> findAll(){
		return productRepository.findAll();
	}

	public Product update(Product product){
		return productRepository.save(product);
	}

	public void deleteById(Long id){
		productRepository.deleteById(id);
	}

	public void deleteAll(List<Product> products){
		productRepository.deleteAll(products);
	}

	public void deleteAll(){
		productRepository.deleteAll();
	}

}
