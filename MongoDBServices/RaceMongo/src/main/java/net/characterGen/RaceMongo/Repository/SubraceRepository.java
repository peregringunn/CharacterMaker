package net.characterGen.RaceMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.RaceMongo.Models.Subrace;

public interface SubraceRepository extends MongoRepository<Subrace, String>{
	
	@Query("{name: '?0'}")
	Subrace findSubraceByName(String name);
	
	public long count();
}
