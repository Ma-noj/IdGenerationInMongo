package com.ty.AutoGeneration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AutoGeneration.dao.StudentDao;
import com.ty.AutoGeneration.document.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao dao;
	
	public Student saveStudent(Student Student) {
		Student.setStudent_Id(SequenceGeneratorService.alphaNumricID("Sudent", Student.SEQUENCE_NAME));
		return dao.saveStudent(Student);
	}
}
