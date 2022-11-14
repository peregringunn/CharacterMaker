package net.characterGen.CharacterClassMong.CharacterClassRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.CharacterClassMongo.CharacterClassModels.CharacterClass;


public interface CharacterClassRepository extends MongoRepository<CharacterClass, String>{
	
	@Query("{name:'?0'}")
	CharacterClass findClassByName(String name);
	
	public long count();

	
}



