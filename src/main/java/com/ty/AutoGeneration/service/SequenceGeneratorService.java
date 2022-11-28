package com.ty.AutoGeneration.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.ty.AutoGeneration.model.DataBaseSequence;
@Service
public class SequenceGeneratorService {
	
	private static MongoOperations mongoOperations;
	
	@Autowired
    public SequenceGeneratorService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

	public static long generateSequence(String seqName) {
		DataBaseSequence counter = mongoOperations.findAndModify(query(where("_Id").is(seqName)),
	      new Update().inc("seq",1), options().returnNew(true).upsert(true),
	      DataBaseSequence.class);
	    return !Objects.isNull(counter) ? counter.getSeq() : 1;
	}
}
