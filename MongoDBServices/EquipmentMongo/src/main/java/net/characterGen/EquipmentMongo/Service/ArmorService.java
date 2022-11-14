package net.characterGen.EquipmentMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.EquipmentMongo.Models.Armor;
import net.characterGen.EquipmentMongo.Repository.ArmorRepository;

@Service
@EnableMongoRepositories(basePackageClasses = ArmorRepository.class)
public class ArmorService {
	@Autowired()
	private ArmorRepository repo;
	public List<Armor> getAllArmor(){
		return repo.findAll();
	}
	public Armor getArmorByName(String name) {
		return repo.findArmorByName(name);
	}
	public void addArmor(String armor) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Armor[] armorArr = objectMapper.readValue(armor, Armor[].class);
			for(int i=0;i<armorArr.length;i++) {
				repo.save(armorArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
