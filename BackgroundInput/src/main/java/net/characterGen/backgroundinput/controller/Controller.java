package net.characterGen.backgroundinput.controller;

import java.util.ArrayList;
import java.util.List;

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
		if(null!=background) {
			if(null==background.getProficiencies()) {
				List<String> proficiencyList = new ArrayList<>();
				proficiencyList.add(new String());
				background.setProficiencies(proficiencyList);
			} else {
				background.getProficiencies().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeProficiency"})
	public String removeProficiency (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getProficiencies().remove(Integer.parseInt(request.getParameter("removeProficiency")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addLanguage"})
	public String addLanguage(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getLanguages()) {
				List<String> languageList = new ArrayList<>();
				languageList.add(new String());
				background.setLanguages(languageList);
			} else {
				background.getLanguages().add(new String());
			}
		}
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"removeLanguage"})
	public String removeLanguage (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getLanguages().remove(Integer.parseInt(request.getParameter("removeLanguage")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addEquipment"})
	public String addEquipment(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getEquipment()) {
				List<String> equipmentList = new ArrayList<>();
				equipmentList.add(new String());
				background.setEquipment(equipmentList);
			} else {
				background.getEquipment().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeEquipment"})
	public String removeEquipment (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getEquipment().remove(Integer.parseInt(request.getParameter("removeEquipment")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addPersonalityTrait"})
	public String addPersonalityTrait(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getPersonalityTraits()) {
				List<String> personalityTraitList = new ArrayList<>();
				personalityTraitList.add(new String());
				background.setPersonalityTraits(personalityTraitList);
			} else {
				background.getPersonalityTraits().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removePersonalityTrait"})
	public String removePersonalityTraits (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getPersonalityTraits().remove(Integer.parseInt(request.getParameter("removePersonalityTrait")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addIdeal"})
	public String addIdeal(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getIdeals()) {
				List<String> idealList = new ArrayList<>();
				idealList.add(new String());
				background.setIdeals(idealList);
			} else {
				background.getIdeals().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeIdeal"})
	public String removeIdeal (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getIdeals().remove(Integer.parseInt(request.getParameter("removeIdeal")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addBond"})
	public String addBond(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getBonds()) {
				List<String> bondList = new ArrayList<>();
				bondList.add(new String());
				background.setBonds(bondList);
			} else {
				background.getBonds().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeBond"})
	public String removeBond (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getBonds().remove(Integer.parseInt(request.getParameter("removeBond")));
		return "background";
	}
	
	@PostMapping(value = "/background", params = {"addFlaw"})
	public String addFlaw(Background background, BindingResult bindingResult) {
		if(null!=background) {
			if(null==background.getFlaws()) {
				List<String> flawList = new ArrayList<>();
				flawList.add(new String());
				background.setFlaws(flawList);
			} else {
				background.getFlaws().add(new String());
			}
		}
		return "background";
	}
	
	
	@PostMapping(value = "/background", params = {"removeFlaw"})
	public String removeFlaw (Background background, BindingResult bindingResult, HttpServletRequest request) {
		background.getFlaws().remove(Integer.parseInt(request.getParameter("removeFlaw")));
		return "background";
	}
}
