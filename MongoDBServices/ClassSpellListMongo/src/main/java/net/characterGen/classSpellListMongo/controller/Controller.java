package net.characterGen.classSpellListMongo.controller;

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

import net.characterGen.classSpellListMongo.Models.ClassSpellList;
import net.characterGen.classSpellListMongo.service.ClassSpellListService;

@RestController
@RequestMapping("/spellList")
public class Controller {
	
	@Autowired
	ClassSpellListService service;

	@GetMapping("/")
	public ResponseEntity<List<ClassSpellList>> getAllClassSpellLists(){
		return ResponseEntity.ok(service.getAllClassSpellLists());
	}
	
	@GetMapping("/{className}")
	public ResponseEntity<ClassSpellList> getClassSpellListByClassName(@PathVariable String className){
		return ResponseEntity.ok(service.getClassSpellListByClassName(className));
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> addClassSpellLists(@RequestBody String classSpellLists){
		service.addClassSpellLists(classSpellLists);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
}
