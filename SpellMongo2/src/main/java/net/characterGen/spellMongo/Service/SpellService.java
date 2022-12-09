package net.characterGen.spellMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.spellMongo.Models.Spell;
import net.characterGen.spellMongo.Repository.SpellRepository;

@Service
@EnableMongoRepositories(basePackageClasses = SpellRepository.class)
public class SpellService {

	@Autowired
	private SpellRepository repo;
	
	public List<Spell> getAllSpells(){
		return repo.findAll();
	}
	
	public Spell getSpellByName(String name) {
		return repo.findSpellByName(name);
	}
	
	public void addSpells (String spells) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Spell[] spellArr = objectMapper.readValue(spells, Spell[].class);
			for (int i=0;i<spellArr.length;i++) {
				repo.save(spellArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}
}
