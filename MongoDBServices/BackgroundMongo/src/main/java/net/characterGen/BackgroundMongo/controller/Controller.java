package net.characterGen.BackgroundMongo.controller;

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

import net.characterGen.BackgroundMongo.Models.Background;
import net.characterGen.BackgroundMongo.Service.BackgroundService;

@RestController
@RequestMapping("/background")
public class Controller {
	
	@Autowired
	BackgroundService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Background>> getAllBackgrounds() {
		return ResponseEntity.ok(service.getAllBackgrounds());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<Background> getBackgroundByName(@PathVariable String name){
		return ResponseEntity.ok(service.getBackgroundByName(name));
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> createBackgrounds (@RequestBody String Backgrounds){
		service.addBackgrounds(Backgrounds);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
}
