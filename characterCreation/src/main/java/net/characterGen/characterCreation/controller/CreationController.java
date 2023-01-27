package net.characterGen.characterCreation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import net.characterGen.characterCreation.model.PlayerCharacter;
import net.characterGen.characterCreation.service.CreationService;

@Controller
public class CreationController {
	
	@Autowired
	CreationService service;
	
	
	@GetMapping("/creation")
	public String creationForm(Model model) {
		model.addAttribute("classList", service.getClassList());
		model.addAttribute("raceList", service.getRaceList());
		model.addAttribute("backgroundList", service.getBackgroundList());
		model.addAttribute("playerCharacter", new PlayerCharacter());
		return "creation";
	}
	
	@PostMapping("/creation")
	public String creationInput(@ModelAttribute PlayerCharacter playerCharacter, Model model) {
		model.addAttribute("playerCharacter", playerCharacter);
		service.addCharacter(playerCharacter);
		model.addAttribute("subraceList", service.getSubraceList(playerCharacter.getRace()));
		return "race-choices";
	}
	
	@GetMapping("/creation/race-choices")
	public String raceChoicesForm(@ModelAttribute PlayerCharacter playerCharacter, Model model) {
		model.addAttribute("playerCharacter", playerCharacter);
		return "race-choices";
	}
	
	@PostMapping("/creation/race-choices")
	public String raceChoicesInput(@ModelAttribute PlayerCharacter playerCharacter, Model model) {
		model.addAttribute("playerCharacter", playerCharacter);
		service.addCharacter(playerCharacter);
		return "class-choices";
	}
	
}
