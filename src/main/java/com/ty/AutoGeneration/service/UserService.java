package com.ty.AutoGeneration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AutoGeneration.dao.UserDao;
import com.ty.AutoGeneration.document.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public User saveUser(User u) {
		u.setU_Id(SequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
		return dao.saveUser(u);
	}
}
