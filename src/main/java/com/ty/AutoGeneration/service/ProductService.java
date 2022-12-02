package com.ty.AutoGeneration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AutoGeneration.dao.ProductDao;
import com.ty.AutoGeneration.document.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	
	public Product saveProduct(Product product) {
		product.setP_Id(SequenceGeneratorService.generateSequence(Product.SEQUENCE_NAME));
		return dao.saveProduct(product);
	}
}
