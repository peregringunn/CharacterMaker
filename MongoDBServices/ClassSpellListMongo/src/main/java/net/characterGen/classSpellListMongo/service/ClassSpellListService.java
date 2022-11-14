package net.characterGen.classSpellListMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.classSpellListMongo.Models.ClassSpellList;
import net.characterGen.classSpellListMongo.repository.ClassSpellListRepository;

@Service
@EnableMongoRepositories(basePackageClasses = ClassSpellListRepository.class)
public class ClassSpellListService {

	@Autowired
	ClassSpellListRepository repo;
	
	public List<ClassSpellList> getAllClassSpellLists(){
		return repo.findAll();
	}
	
	public ClassSpellList getClassSpellListByClassName(String className) {
		return repo.getClassSpellListByClassName(className);
	}
	
	public void addClassSpellLists(String classSpellLists) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			ClassSpellList[] list = objectMapper.readValue(classSpellLists, ClassSpellList[].class);
			for(int i=0;i<list.length;i++) {
				repo.save(list[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
