package net.characterGen.EquipmentMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.characterGen.EquipmentMongo.Models.Weapon;
import net.characterGen.EquipmentMongo.Repository.WeaponRepository;

@Service
@EnableMongoRepositories(basePackageClasses = WeaponRepository.class)
public class WeaponService {

	@Autowired
	private WeaponRepository repo;
	
	public List<Weapon> getAllWeapons() {
		return repo.findAll();
	}
	
	public Weapon getWeaponByName(String name) {
		return repo.findWeaponByName(name);
	}
	
	public void addWeapons(String weapons) {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			Weapon[] weaponArr = objectMapper.readValue(weapons, Weapon[].class);
			for (int i=0;i<weaponArr.length;i++) {
				repo.save(weaponArr[i]);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
