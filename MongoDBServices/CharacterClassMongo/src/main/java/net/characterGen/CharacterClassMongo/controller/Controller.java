package net.characterGen.CharacterClassMongo.controller;

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

import net.characterGen.CharacterClassMongo.CharacterClassModels.CharacterClass;
import net.characterGen.CharacterClassMongo.services.CharacterClassService;

@RestController
@RequestMapping("/class")
public class Controller {
	
	@Autowired
	CharacterClassService service;
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> createClasses (@RequestBody String newClass) {
		service.addClasses(newClass);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<CharacterClass>> getAllClasses(){
		return ResponseEntity.ok(service.getAllClasses());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<CharacterClass> getClassByName(@PathVariable String name){
		return ResponseEntity.ok(service.getClassByName(name));
		
	}
}
