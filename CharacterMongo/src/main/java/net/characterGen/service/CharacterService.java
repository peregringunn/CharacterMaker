package net.characterGen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.models.PlayerCharacter;
import net.characterGen.repository.CharacterRepository;

@Service
@EnableMongoRepositories(basePackageClasses = CharacterRepository.class)
public class CharacterService {

	@Autowired
	private CharacterRepository repo;
	
	public List<PlayerCharacter> getAllCharacters(){
		return repo.findAll();
	}
	
	public PlayerCharacter getCharacterByName(String name) {
		return repo.findByName(name);
	}
	
	public void addCharacters(String characters) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			PlayerCharacter[] characterArr = objectMapper.readValue(characters, PlayerCharacter[].class);
			for (int i=0; i < characterArr.length;i++) {
				repo.save(characterArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}
}
