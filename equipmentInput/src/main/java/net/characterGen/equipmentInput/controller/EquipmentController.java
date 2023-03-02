package net.characterGen.equipmentInput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import net.characterGen.equipmentInput.Models.Armor;
import net.characterGen.equipmentInput.Models.Equipment;
import net.characterGen.equipmentInput.Models.Weapon;
import net.characterGen.equipmentInput.service.ArmorService;
import net.characterGen.equipmentInput.service.EquipmentService;
import net.characterGen.equipmentInput.service.WeaponService;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	EquipmentService service;
	@Autowired
	ArmorService armorService;
	@Autowired
	WeaponService weaponService;
	
	@GetMapping("/")
	public String equipmentForm(Model model) {
		model.addAttribute("equipment", new Equipment());
		return "equipment";
	}
	
	@PostMapping("/")
	public String equipmentInput(@ModelAttribute Equipment equipment, Model model) {
		model.addAttribute("equipment", equipment);
		service.addEquipment(equipment);
		return "equipmentResult";
	}
	
	@GetMapping("/weapon")
	public String weaponForm (Model model) {
		model.addAttribute("weapon", new Weapon());
		return "weapon";
	}
	
	@PostMapping("/weapon")
	public String weaponInput(@ModelAttribute Weapon weapon, Model model) {
		model.addAttribute("weapon", weapon);
		weaponService.addWeapon(weapon);
		return "weaponResult";
	}
	
	@PostMapping(value = "/weapon", params = "addProperty")
	public String addWeapon (Weapon weapon, BindingResult bindingResult) {
		try {
			weapon.addProperty("");
		} catch (NullPointerException e) {
			weapon.setProperties(service.intializeList());
		}
		return "weapon";
	}
	
	@PostMapping(value = "/weapon", params = "removeProperty")
	public String removeWeapon (Weapon weapon, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeProperty"));
		weapon.removePropertyAt(index);
		return "weapon";
	}
	
	@GetMapping("/armor")
	public String armorForm(Model model) {
		model.addAttribute("armor", new Armor());
		return "armor";
	}
	
	@PostMapping("/armor")
	public String armorInput(@ModelAttribute Armor armor, Model model) {
		model.addAttribute("armor", armor);
		armorService.addArmor(armor);
		return "armorResult";
	}
}
