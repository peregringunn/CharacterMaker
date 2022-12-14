package net.characterGen.characterMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.characterMongo.Models.PlayerCharacter;



public interface CharacterRepository extends MongoRepository<PlayerCharacter, String>{
	@Query("{name:'?0'}")
	PlayerCharacter findByName(String name);

	public long count();
}
