package net.characterGen.equipmentInput.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import net.characterGen.equipmentInput.Models.Weapon;
import net.characterGen.equipmentInput.service.WeaponService;

@Controller
@RequestMapping
public class WeaponController {
	
	
	@Autowired
	WeaponService service;
	
	@GetMapping("/weapon")
	public String weaponForm (Model model) {
		model.addAttribute("weapon", new Weapon());
		return "weapon";
	}
	
	@PostMapping("/weapon")
	public String weaponInput(@ModelAttribute Weapon weapon, Model model) {
		model.addAttribute("weapon", weapon);
		service.addWeapon(weapon);
		return "weaponResult";
	}
	
	@PostMapping(value = "/weapon", params = "addProperty")
	public String addWeapon (Weapon weapon, BindingResult bindingResult) {
		if (null!=weapon) {
			if(null==weapon.getProperties()) {
				List<String> propertyList = new ArrayList<>();
				propertyList.add(new String());
				weapon.setProperties(propertyList);
			} else {
				weapon.getProperties().add(new String());
			}
		}
		return "weapon";
	}
	
	@PostMapping(value = "/weapon", params = "removeProperty")
	public String removeWeapon (Weapon weapon, BindingResult bindingResult, HttpServletRequest request) {
		weapon.getProperties().remove(Integer.parseInt(request.getParameter("removeWeapon")));
		return "weapon";
	}
}
