package net.characterGen.RaceMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.RaceMongo.Models.Subrace;
import net.characterGen.RaceMongo.Repository.SubraceRepository;

@Service
@EnableMongoRepositories(basePackageClasses = SubraceRepository.class)
public class SubraceService {
	
	@Autowired
	private SubraceRepository repo;
	
	public List<Subrace> getAllSubRaces(){
		return repo.findAll();
	}
	
	public Subrace getSubraceByName(String name) {
		return repo.findSubraceByName(name);
	}
	
	public void addSubraces (String subraces) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Subrace[] racesArr = objectMapper.readValue(subraces, Subrace[].class);
			for(int i=0;i<racesArr.length;i++) {
				repo.save(racesArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
