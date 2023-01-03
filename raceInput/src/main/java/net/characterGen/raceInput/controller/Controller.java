package net.characterGen.raceInput.controller;

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
import net.characterGen.raceInput.Models.Feature;
import net.characterGen.raceInput.Models.Race;
import net.characterGen.raceInput.Models.ScoreBonus;
import net.characterGen.raceInput.service.RaceService;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@Autowired
	RaceService service;
	
	@GetMapping("/race")
	public String raceForm (Model model) {
		model.addAttribute("race", new Race());
		return "race";
	}
	
	@PostMapping("/race")
	public String raceInput(@ModelAttribute Race race, Model model) {
		model.addAttribute("race", race);
		service.addRace(race);
		return "result";
	}
	
	@PostMapping(value = "/race", params = "addBonus")
	public String addBonus (Race race, BindingResult bindingResult) {
		if (null!=race) {
			if(null==race.getScoreBonuses()) {
				List<ScoreBonus> bonusList = new ArrayList<>();
				bonusList.add(new ScoreBonus());
				race.setScoreBonuses(bonusList);
			} else {
				race.getScoreBonuses().add(new ScoreBonus());
			}
		}
		return "race";
	}
	
	@PostMapping(value = "/race", params = "removeBonus")
	public String removeBonus (Race race, BindingResult bindingResult, HttpServletRequest request) {
		race.getScoreBonuses().remove(Integer.parseInt(request.getParameter("removeBonus")));
		return "race";
	}
	
	@PostMapping(value = "/race", params = "addProficiency")
	public String addProficiency (Race race, BindingResult bindingResult) {
		if (null!=race) {
			if(null==race.getProficiencies()) {
				List<String> proficiencyList = new ArrayList<>();
				proficiencyList.add(new String());
				race.setProficiencies(proficiencyList);
			} else {
				race.getProficiencies().add(new String());
			}
		}
		return "race";
	}
	
	@PostMapping(value = "/race", params = "removeProficiency")
	public String removeProficiency (Race race, BindingResult bindingResult, HttpServletRequest request) {
		race.getProficiencies().remove(Integer.parseInt(request.getParameter("removeProficiency")));
		return "race";
	}
	
	@PostMapping(value = "/race", params = "addTrait")
	public String addTrait (Race race, BindingResult bindingResult) {
		if (null!=race) {
			if(null==race.getTraits()) {
				List<Feature> traitList = new ArrayList<>();
				traitList.add(new Feature());
				race.setTraits(traitList);
			} else {
				race.getTraits().add(new Feature());
			}
		}
		return "race";
	}
	
	@PostMapping(value = "/race", params = "removeTrait")
	public String removeTrait (Race race, BindingResult bindingResult, HttpServletRequest request) {
		race.getTraits().remove(Integer.parseInt(request.getParameter("removeTrait")));
		return "race";
	}
	
	@PostMapping(value = "/race", params = "addSubrace")
	public String addSubrace (Race race, BindingResult bindingResult) {
		if (null!=race) {
			if(null==race.getSubraces()) {
				List<String> subraceList = new ArrayList<>();
				subraceList.add(new String());
				race.setSubraces(subraceList);
			} else {
				race.getSubraces().add(new String());
			}
		}
		return "race";
	}
	
	@PostMapping(value = "/race", params = "removeSubrace")
	public String removeSubrace (Race race, BindingResult bindingResult, HttpServletRequest request) {
		race.getSubraces().remove(Integer.parseInt(request.getParameter("removeSubrace")));
		return "race";
	}
}
