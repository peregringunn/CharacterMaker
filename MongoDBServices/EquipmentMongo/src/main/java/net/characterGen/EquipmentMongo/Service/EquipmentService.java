package net.characterGen.EquipmentMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.EquipmentMongo.Models.Equipment;
import net.characterGen.EquipmentMongo.Repository.EquipmentRepository;

@Service
@EnableMongoRepositories(basePackageClasses = EquipmentRepository.class)
public class EquipmentService {

	@Autowired
	private EquipmentRepository repo;
	
	public List<Equipment> getAllEquipment(){
		return repo.findAll();
	}
	
	public Equipment getEquipmentByname(String name) {
		return repo.findEquipmentByName(name);
	}

	public void addEquipment(String equipment) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Equipment[] equipmentArr = objectMapper.readValue(equipment, Equipment[].class);
			for(int i=0;i<equipmentArr.length;i++) {
				repo.save(equipmentArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}
}
