package net.characterGen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.models.PlayerCharacter;

public interface CharacterRepository extends MongoRepository<PlayerCharacter, String>{
	@Query("{name:'?0'}")
	PlayerCharacter findByName(String name);

	public long count();
}
