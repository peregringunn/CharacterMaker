package net.characterGen.RaceMongo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.RaceMongo.Models.Race;
import net.characterGen.RaceMongo.Repository.RaceRepository;

@Service
@EnableMongoRepositories(basePackageClasses = RaceRepository.class)
public class RaceService {
	
	@Autowired
	private RaceRepository repo;

	public List<Race> getAllRaces(){
		return repo.findAll();
		
	}
	
	public Race getRaceByName(String name) {
		return repo.findRaceByName(name);
	}
	
	public void addRaces (String races) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Race[] racesArr = objectMapper.readValue(races, Race[].class);
			for(int i=0;i<racesArr.length;i++) {
				repo.save(racesArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public List<String> getRaceNames() {
		List<Race> raceList = repo.findAll();
		List<String> raceNameList = new ArrayList<>();
		for (int i = 0; i < raceList.size(); i++) {
			raceNameList.add(raceList.get(i).getName());
		}
		return raceNameList;
	}

}
