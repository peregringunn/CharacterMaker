package net.characterGen.EquipmentMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import net.characterGen.EquipmentMongo.Models.Weapon;

@Component
public interface WeaponRepository extends MongoRepository<Weapon, String> {
	@Query("{name:'?0'}")
	Weapon findWeaponByName(String name);
	public long count();
}
