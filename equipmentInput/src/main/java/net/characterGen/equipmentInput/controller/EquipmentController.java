package net.characterGen.equipmentInput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.characterGen.equipmentInput.Models.Equipment;
import net.characterGen.equipmentInput.service.EquipmentService;

@Controller
@RequestMapping
public class EquipmentController {
	
	@Autowired
	EquipmentService service;
	
	@GetMapping("/equipment")
	public String equipmentForm(Model model) {
		model.addAttribute("equipment", new Equipment());
		return "equipment";
	}
	
	@PostMapping("/equipment")
	public String equipmentInput(@ModelAttribute Equipment equipment, Model model) {
		model.addAttribute("equipment", equipment);
		service.addEquipment(equipment);
		return "equipmentResult";
	}
}
