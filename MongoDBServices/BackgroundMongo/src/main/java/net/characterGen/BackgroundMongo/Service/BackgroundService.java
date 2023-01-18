package net.characterGen.BackgroundMongo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.BackgroundMongo.Models.Background;
import net.characterGen.BackgroundMongo.repository.BackgroundRepository;



@Service
@EnableMongoRepositories(basePackageClasses = BackgroundRepository.class)
public class BackgroundService {
	
	@Autowired
	BackgroundRepository repo;
	
	public List<Background> getAllBackgrounds(){
		return repo.findAll();
	}
	
	public Background getBackgroundByName(String name) {
		return repo.findBackgroundByName(name);
	}
	
	public void addBackgrounds(String backgrounds) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Background[] backgroundArr = objectMapper.readValue(backgrounds, Background[].class);
			for (int i=0;i<backgroundArr.length;i++) {
				System.out.println(backgroundArr[i]);
				repo.save(backgroundArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public List<String> getBackgroundNames() {
		List<Background> backgroundList = repo.findAll();
		List<String> nameList = new ArrayList<>();
		for (int i = 0 ; i < backgroundList.size(); i++) {
			nameList.add(backgroundList.get(i).getName());
		}
		return nameList;
	}
}
