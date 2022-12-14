package net.characterGen.backgroundinput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import net.characterGen.backgroundinput.models.Background;
import net.characterGen.backgroundinput.models.FormBackground;
import net.characterGen.backgroundinput.service.BackgroundService;

@org.springframework.stereotype.Controller
@RequestMapping()
public class Controller {
   
	@Autowired
	BackgroundService service;

	@GetMapping("/background")
	public String backgroundForm(Model model){
		model.addAttribute("background", new Background());
		return "background";
	}
	
	@PostMapping("/background")
	public String backgroundInput(@ModelAttribute FormBackground background, Model model){
		model.addAttribute("background", background);
		service.background(background);
		return "result";		
	}
	

	

}
