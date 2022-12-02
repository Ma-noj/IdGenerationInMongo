package com.ty.AutoGeneration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ty.AutoGeneration.document.Product;
import com.ty.AutoGeneration.document.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

}
