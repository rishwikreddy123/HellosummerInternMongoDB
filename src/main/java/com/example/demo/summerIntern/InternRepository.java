package com.example.demo.summerIntern;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface InternRepository extends MongoRepository <Intern, String> {
	

	
}
