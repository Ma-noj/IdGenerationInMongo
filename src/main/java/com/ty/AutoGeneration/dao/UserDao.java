package com.ty.AutoGeneration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AutoGeneration.document.User;
import com.ty.AutoGeneration.repository.UserRepo;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepo repo;
	public User saveUser(User u) {
		return repo.insert(u);
	}
}
