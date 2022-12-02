package com.ty.AutoGeneration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ty.AutoGeneration.document.Product;

public interface ProductRepo extends MongoRepository<Product, Long> {

}
