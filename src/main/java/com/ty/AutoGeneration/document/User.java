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
@Document(collection ="user")
public class User {
	@Transient
    public static final String SEQUENCE_NAME = "TYP";
	
	@Id
	private long u_Id;
	
	private String firstName;
    private String lastName;
    private String emailId;
}
