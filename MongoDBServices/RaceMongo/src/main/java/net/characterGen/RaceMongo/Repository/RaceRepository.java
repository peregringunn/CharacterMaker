package net.characterGen.RaceMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.RaceMongo.Models.Race;

public interface RaceRepository extends MongoRepository<Race, String>{
	
	@Query("{name:'?0'}")
	Race findRaceByName(String name);
	
	public long count();
}
