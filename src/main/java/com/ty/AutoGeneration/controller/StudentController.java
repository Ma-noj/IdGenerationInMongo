package com.ty.AutoGeneration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AutoGeneration.document.Student;
import com.ty.AutoGeneration.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping()
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
}
