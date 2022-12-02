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
@Document(collection ="product")
public class Product {
	@Transient
    public static final String SEQUENCE_NAME = "Product_Sequence";
	
	@Id
	private long p_Id;
	
	private String productName;
	private double price;
	private int qyt;
}
