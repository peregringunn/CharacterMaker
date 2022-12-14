package net.characterGen.spellMongo.controller;

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

import net.characterGen.spellMongo.Models.Spell;
import net.characterGen.spellMongo.Service.SpellService;

@RestController
@RequestMapping("/spell/")
public class Controller {

	@Autowired
	SpellService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Spell>> getAllSpells(){
		return ResponseEntity.ok(service.getAllSpells());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<Spell> getSpellByName(@PathVariable String name){
		return ResponseEntity.ok(service.getSpellByName(name));		
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> addSpells(@RequestBody String spells){
		service.addSpells(spells);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	
}
