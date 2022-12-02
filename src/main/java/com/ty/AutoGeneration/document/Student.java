package com.ty.AutoGeneration.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection ="student")
public class Student {
	@Transient
    public static final String SEQUENCE_NAME = "Student_Sequence";
	
	@Id
	private String student_Id;
	
	private String name;
	private double marks;
}
