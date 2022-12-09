package net.characterGen.cotroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class Controller {
	
	
	@GetMapping("/")
	public ResponseEntity<String> getAllCharacters(){
		return ResponseEntity.ok("Hello world");
	}
}
