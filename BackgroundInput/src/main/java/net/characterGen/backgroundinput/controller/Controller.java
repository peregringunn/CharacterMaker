package net.characterGen.backgroundinput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import net.characterGen.backgroundinput.models.Background;
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
	public String backgroundInput(@ModelAttribute Background background, Model model){
		model.addAttribute("background", background);
		service.addBackground(background);
		return "result";		
	}

	@PostMapping(value = "/background", params = {"addProficiency"})
	public String addProficency(Background background, BindingResult bindingResult) {
		try {
			background.addProficency(new String());
		} catch (Exception e) {
			background.setProficiencies(service.intializeList());
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeProficiency"})
	public String removeProficiency (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeProficiency"));
		background.removeProficiency(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addLanguage"})
	public String addLanguage(Background background, BindingResult bindingResult) {
		try {
			background.addLanguge(new String());
		} catch (Exception e) {
			background.setLanguages(service.intializeList());
		}
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"removeLanguage"})
	public String removeLanguage (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeLanguage"));
		background.removeLanguage(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addEquipment"})
	public String addEquipment(Background background, BindingResult bindingResult) {
		try {
			background.addEquipment(new String());
		} catch (NullPointerException e) {
			background.setEquipment(service.intializeList());
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeEquipment"})
	public String removeEquipment (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeEquipment"));
		background.removeEquipment(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addPersonalityTrait"})
	public String addPersonalityTrait(Background background, BindingResult bindingResult) {
		try {
			background.getPersonalityTraits().add(new String());
		} catch (NullPointerException e) {
			background.setPersonalityTraits(service.intializeList());
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removePersonalityTrait"})
	public String removePersonalityTraits (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removePersonalityTrait"));
		background.getPersonalityTraits().remove(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addIdeal"})
	public String addIdeal(Background background, BindingResult bindingResult) {
		try {
			background.getIdeals().add(new String());
		} catch (NullPointerException e) {
			background.setIdeals(service.intializeList());
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeIdeal"})
	public String removeIdeal (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeIdeal"));
		background.removeIdeal(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addBond"})
	public String addBond(Background background, BindingResult bindingResult) {
		try {
			background.addBond(new String());
		} catch (NullPointerException e) {
			background.setBonds(service.intializeList()); 
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeBond"})
	public String removeBond (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeBond"));
		background.removeBond(parseInt);
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addFlaw"})
	public String addFlaw(Background background, BindingResult bindingResult) {
		try {
			background.addFlaw("");
		} catch (NullPointerException e) {
			background.setFlaws(service.intializeList());
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeFlaw"})
	public String removeFlaw (Background background, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("removeFlaw"));
		background.removeFlaw(parseInt);
		return "background";
	}
}
