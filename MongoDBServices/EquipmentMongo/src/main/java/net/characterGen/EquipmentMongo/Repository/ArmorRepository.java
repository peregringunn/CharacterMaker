package net.characterGen.EquipmentMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import net.characterGen.EquipmentMongo.Models.Armor;

@Component
public interface ArmorRepository extends MongoRepository<Armor, String>{
	@Query("{name:'?0'}")
	Armor findArmorByName(String name);
	public long count();
}
