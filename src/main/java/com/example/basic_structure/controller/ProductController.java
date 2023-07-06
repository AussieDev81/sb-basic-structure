package com.example.basic_structure.controller;

import com.example.basic_structure.model.Product;
import com.example.basic_structure.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping
	public ResponseEntity<Product> add(@RequestBody Product product){
		return ResponseEntity.ok(productService.add(product));
	}

	@PostMapping("/all")
	public ResponseEntity<List<Product>> addAll(@RequestBody List<Product> products){
		return ResponseEntity.ok(productService.addAll(products));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		return ResponseEntity.ok(productService.findById(id));
	}

	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok(productService.findAll());
	}

	@PutMapping
	public ResponseEntity<Product> update(@RequestBody Product product){
		return ResponseEntity.ok(productService.update(product));
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id){
		productService.deleteById(id);
	}

	@DeleteMapping("/all")
	public void deleteAll(@RequestBody List<Product> products){
		productService.deleteAll(products);
	}

	@DeleteMapping
	public void deleteAll(){
		productService.deleteAll();
	}

}
