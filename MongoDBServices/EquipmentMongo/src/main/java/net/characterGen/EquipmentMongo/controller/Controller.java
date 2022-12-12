package net.characterGen.EquipmentMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.characterGen.EquipmentMongo.Models.Armor;
import net.characterGen.EquipmentMongo.Models.Equipment;
import net.characterGen.EquipmentMongo.Models.Weapon;
import net.characterGen.EquipmentMongo.Service.ArmorService;
import net.characterGen.EquipmentMongo.Service.EquipmentService;
import net.characterGen.EquipmentMongo.Service.WeaponService;

@RestController
@RequestMapping("/equipment/")
public class Controller {
	@Autowired
	ArmorService armorService;
	@Autowired
	EquipmentService equipmentService;
	@Autowired
	WeaponService weaponService;
	
	@GetMapping("/armor")
	public ResponseEntity<List<Armor>> getAllArmor(){
		return ResponseEntity.ok(armorService.getAllArmor());
	}
	@GetMapping("/armor/{name}")
	public ResponseEntity<Armor> getArmorByName(@PathVariable String name){
		return ResponseEntity.ok(armorService.getArmorByName(name));
	}
	@PostMapping("/armor")
	public ResponseEntity<HttpStatus> addArmor(@RequestBody String Armor){
		armorService.addArmor(Armor);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<List<Equipment>> getAllEquipment(){
		return ResponseEntity.ok(equipmentService.getAllEquipment());
	}
	@GetMapping("/{name}")
	public ResponseEntity<Equipment> getEquipmentByName(@PathVariable String name){
		return ResponseEntity.ok(equipmentService.getEquipmentByname(name));
	}
	@PostMapping("/")
	public ResponseEntity<HttpStatus> addEquipment(@RequestBody String equipment){
		equipmentService.addEquipment(equipment);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	@GetMapping("/weapon")
	public ResponseEntity<List<Weapon>> getAllWeapons(){
		return ResponseEntity.ok(weaponService.getAllWeapons());
	}
	@GetMapping("/weapon/{name}")
	public ResponseEntity<Weapon> getWeaponByName(@PathVariable String name){
		return ResponseEntity.ok(weaponService.getWeaponByName(name));
	}
	@PostMapping("/weapon")
	public ResponseEntity<HttpStatus> addWeapons(@RequestBody String weapons){
		weaponService.addWeapons(weapons);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
}
