package net.characterGen.characterMongo.controller;

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

import net.characterGen.characterMongo.Models.PlayerCharacter;
import net.characterGen.characterMongo.Service.CharacterService;

@RestController
@RequestMapping("/character/")
public class Controller {

	@Autowired
	CharacterService service;
	
	@GetMapping("/")
	public ResponseEntity<List<PlayerCharacter>> getAllSpells(){
		return ResponseEntity.ok(service.getAllCharacters());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<PlayerCharacter> getSpellByName(@PathVariable String name){
		return ResponseEntity.ok(service.getCharacterByName(name));		
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> addSpells(@RequestBody String spells){
		service.addCharacters(spells);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	
}
