package net.characterGen.BackgroundMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import net.characterGen.BackgroundMongo.Models.Background;


public interface BackgroundRepository extends MongoRepository<Background, String>{

	@Query("{name:'?0'}")
	Background findBackgroundByName(String name);
	
	public long count();	
}
