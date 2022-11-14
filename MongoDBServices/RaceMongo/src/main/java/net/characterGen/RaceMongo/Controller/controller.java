package net.characterGen.RaceMongo.Controller;

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

import net.characterGen.RaceMongo.Models.Race;
import net.characterGen.RaceMongo.Service.RaceService;

@RestController
@RequestMapping("/race")
public class controller {
	
	@Autowired
	RaceService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Race>> getAllRaces(){
		return ResponseEntity.ok(service.getAllRaces());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<Race> getRaceByName(@PathVariable String name){
		return ResponseEntity.ok(service.getRaceByName(name));
	}
	
	@PostMapping("/")
	public ResponseEntity<HttpStatus> createRaces (@RequestBody String races){
		service.addRaces(races);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
}
