package com.ty.AutoGeneration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AutoGeneration.document.Product;
import com.ty.AutoGeneration.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping()
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
}
