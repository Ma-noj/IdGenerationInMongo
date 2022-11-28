package com.ty.AutoGeneration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection = "dataBase_sequence")
public class DataBaseSequence {
	@Id
	private String Id;
	private long seq;
	
}
