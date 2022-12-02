package com.ty.AutoGeneration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AutoGeneration.document.Student;
import com.ty.AutoGeneration.repository.StudentRepo;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepo repo;
	public Student saveStudent(Student Student) {
		return repo.insert(Student);
	}
}
