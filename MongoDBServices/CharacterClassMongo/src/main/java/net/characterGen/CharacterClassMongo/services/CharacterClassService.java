package net.characterGen.CharacterClassMongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.CharacterClassMong.CharacterClassRepository.CharacterClassRepository;
import net.characterGen.CharacterClassMongo.CharacterClassModels.CharacterClass;

@Service
@EnableMongoRepositories(basePackageClasses = CharacterClassRepository.class)
public class CharacterClassService {
	
	@Autowired
	private CharacterClassRepository classRepo;
	
	
	public void addClasses(String newClass) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			CharacterClass[] classes = objectMapper.readValue(newClass, CharacterClass[].class);
			for (int i=0;i<classes.length;i++) {
					classRepo.save(classes[i]);
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}		
	}


	public List<CharacterClass> getAllClasses() {
		
		return classRepo.findAll();
	}


	public CharacterClass getClassByName(String name) {
		return classRepo.findClassByName(name);
	}

}
