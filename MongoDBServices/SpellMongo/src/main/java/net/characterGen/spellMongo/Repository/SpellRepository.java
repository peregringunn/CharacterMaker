package net.characterGen.spellMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import net.characterGen.spellMongo.Models.Spell;

public interface SpellRepository extends MongoRepository<Spell, String> {
	@Query("{name:'?0'}")
	Spell findSpellByName(String name);
	
	public long count();
}
