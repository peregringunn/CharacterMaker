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
import net.characterGen.RaceMongo.Models.Subrace;
import net.characterGen.RaceMongo.Service.RaceService;
import net.characterGen.RaceMongo.Service.SubraceService;

@RestController
@RequestMapping("/race")
public class controller {
	
	@Autowired
	RaceService service;
	@Autowired
	SubraceService subraceService;
	
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
	
	@GetMapping("/names")
	public ResponseEntity<List<String>> getRaceNames(){
		return ResponseEntity.ok(service.getRaceNames());
	}
	
	@GetMapping("/subrace")
	public ResponseEntity<List<Subrace>> getAllSubraces(){
		return ResponseEntity.ok(subraceService.getAllSubRaces());
	}
	
	@GetMapping("/subrace/{name}")
	public ResponseEntity<Subrace> getSubraceByName(@PathVariable String name){
		return ResponseEntity.ok(subraceService.getSubraceByName(name));
	}
	
	@PostMapping("/subrace")
	public ResponseEntity<HttpStatus> createSubraces(@RequestBody String subraces){
		subraceService.addSubraces(subraces);
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
}
