package net.characterGen.equipmentInput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.characterGen.equipmentInput.Models.Armor;
import net.characterGen.equipmentInput.service.ArmorService;

@Controller
@RequestMapping
public class armorController {
	
	@Autowired
	ArmorService service;
	
	@GetMapping("/armor")
	public String armorForm(Model model) {
		model.addAttribute("armor", new Armor());
		return "armor";
	}
	
	@PostMapping("/armor")
	public String armorInput(@ModelAttribute Armor armor, Model model) {
		model.addAttribute("armor", armor);
		service.addArmor(armor);
		return "armorResult";
	}
	
}
