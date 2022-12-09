package net.characterGen.controller;

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

import net.characterGen.models.PlayerCharacter;
import net.characterGen.service.CharacterService;

@RestController
@RequestMapping("/character/")
public class Controller {
	
	@Autowired
	CharacterService service;
	
	@GetMapping("/")
	public ResponseEntity<List<PlayerCharacter>> getAllCharacters(){
		return ResponseEntity.ok(service.getAllCharacters());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<PlayerCharacter> getCharacterByName(@PathVariable String name){
		return ResponseEntity.ok(service.getCharacterByName(name));
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> addCharacters(@RequestBody String Characters){
		service.addCharacters(Characters);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	

}
