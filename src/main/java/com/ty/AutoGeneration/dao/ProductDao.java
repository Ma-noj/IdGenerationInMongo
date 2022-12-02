package com.ty.AutoGeneration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AutoGeneration.document.Product;
import com.ty.AutoGeneration.repository.ProductRepo;

@Repository
public class ProductDao {
	
	@Autowired
	private ProductRepo repo;
	public Product saveProduct(Product product) {
		return repo.insert(product);
	}
}
