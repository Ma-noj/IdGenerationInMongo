package com.ty.AutoGeneration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ty.AutoGeneration.document.User;

public interface UserRepo extends MongoRepository<User, Long> {

}
