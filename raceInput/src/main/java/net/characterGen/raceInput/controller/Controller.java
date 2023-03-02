package net.characterGen.raceInput.controller;

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
import net.characterGen.raceInput.Models.Subrace;
import net.characterGen.raceInput.service.RaceService;
import net.characterGen.raceInput.service.SubraceService;

@org.springframework.stereotype.Controller
@RequestMapping("/race")
public class Controller {

	@Autowired
	RaceService service;
	
	@GetMapping("/")
	public String raceForm (Model model) {
		model.addAttribute("race", new Race());
		return "race";
	}
	
	@PostMapping("/")
	public String raceInput(@ModelAttribute Race race, Model model) {
		model.addAttribute("race", race);
		service.addRace(race);
		return "result";
	}
	
	@PostMapping(value = "/race", params = "addBonus")
	public String addBonus (Race race, BindingResult bindingResult) {
		try {
			race.addScoreBonus(new ScoreBonus());
		} catch (NullPointerException e) {
			race.initializeProficiencies();
		}
		return "race";
	}
	
	@PostMapping(value = "/", params = "removeBonus")
	public String removeBonus (Race race, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeBonus"));
		race.removeScoreBonusAt(index);
		return "race";
	}
	
	@PostMapping(value = "/", params = "addProficiency")
	public String addProficiency (Race race, BindingResult bindingResult) {
		try {
			race.addProficiency(new String());
		} catch (NullPointerException e) {
			race.initializeProficiencies();
		}
		return "race";
	}
	
	@PostMapping(value = "/", params = "removeProficiency")
	public String removeProficiency (Race race, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeProficiency"));
		race.removeProficiencyAt(index);
		return "race";
	}
	
	@PostMapping(value = "/", params = "addTrait")
	public String addTrait (Race race, BindingResult bindingResult) {
		try {
			race.addTrait(new Feature());
		} catch (NullPointerException e) {
			race.initializeTraits();
		}
		return "race";
	}
	
	@PostMapping(value = "/", params = "removeTrait")
	public String removeTrait (Race race, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeTrait"));
		race.removeTrait(index);
		return "race";
	}
	
	@PostMapping(value = "/", params = "addSubrace")
	public String addSubrace (Race race, BindingResult bindingResult) {
				try {
					race.addSubrace(new String());
				} catch (NullPointerException e) {
					race.initializeSubrace();
				}
		return "race";
	}
	
	@PostMapping(value = "/", params = "removeSubrace")
	public String removeSubrace (Race race, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSubrace"));
		race.removeSubraceAt(index);
		return "race";
	}
	
	@Autowired
	SubraceService subraceService;
	
	@GetMapping ("/subrace")
	public String subraceForm (Model model) {
		model.addAttribute("subrace", new Subrace());
		return "subrace";
	}
	
	@PostMapping ("/subrace")
	public String subraceInput (@ModelAttribute Subrace subrace, Model model) {
		model.addAttribute("subrace", subrace);
		subraceService.addSubrace(subrace);
		return "subraceResult";
	}
	
	@PostMapping (value = "/subrace", params = "addSubraceBonus")
	public String addSubraceBonus (Subrace subrace, BindingResult bindingResult) {
		try {
			subrace.addScoreBonus(new ScoreBonus());
		} catch (NullPointerException e) {
			subrace.initializeScoreBonusList();
		}
		return "subrace";
	}
	
	@PostMapping (value = "/subrace", params = "removeSubraceBonus")
	public String removeSubraceBonus (Subrace subrace, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSubraceBonus"));
		subrace.removeScoreBonusAt(index);
		return "subrace";
	}
	
	@PostMapping(value = "/subrace", params = "addSubraceTrait")
	public String addSubraceTrait (Subrace subrace, BindingResult bindingResult) {
				try {
					subrace.addTrait(new Feature());
				} catch (Exception e) {
					subrace.initializeTraits();
				}
		return "subrace";
	}
	
	@PostMapping(value = "/subrace", params = "removeSubraceTrait")
	public String removeSubraceTrait (Subrace subrace, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSubraceTrait"));
		subrace.removeTraitAt(index);
		return "subrace";
	}
}
