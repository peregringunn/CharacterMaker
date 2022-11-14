package net.characterGen.classSpellListMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.classSpellListMongo.Models.ClassSpellList;

public interface ClassSpellListRepository extends MongoRepository<ClassSpellList, String> {

	@Query("{className:'?0'}")
	public ClassSpellList getClassSpellListByClassName(String className);
	
	public long count();
	
}
