package net.characterGen.backgroundinput.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import net.characterGen.backgroundinput.models.Background;

@org.springframework.stereotype.Controller
@RequestMapping()
public class Controller {
   

	@GetMapping("/background")
	public String backgroundForm(Model model){
		model.addAttribute("background", new Background());
		return "background";
	}
	
	@PostMapping("/background")
	public String backgroundInput(@ModelAttribute Background background, Model model){
		model.addAttribute("background", background);
//		System.out.println(model.toString());
//		System.out.println(background.toString());
		return "result";		
	}
	

	

}
