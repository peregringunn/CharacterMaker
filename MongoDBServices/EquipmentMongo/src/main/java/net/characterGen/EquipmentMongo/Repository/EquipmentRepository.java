package net.characterGen.EquipmentMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import net.characterGen.EquipmentMongo.Models.Equipment;

@Component
public interface EquipmentRepository extends MongoRepository<Equipment, String>{
	@Query("{name:'?0'}")
	Equipment findEquipmentByName(String name);
	public long count();
}
