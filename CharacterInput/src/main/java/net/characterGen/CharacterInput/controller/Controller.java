package net.characterGen.CharacterInput.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import net.characterGen.CharacterInput.models.Ally;
import net.characterGen.CharacterInput.models.ClassStats;
import net.characterGen.CharacterInput.models.Demographics;
import net.characterGen.CharacterInput.models.Gear;
import net.characterGen.CharacterInput.models.PlayerCharacter;
import net.characterGen.CharacterInput.models.Proficiencies;
import net.characterGen.CharacterInput.models.StatBlock;
import net.characterGen.CharacterInput.models.Survival;
import net.characterGen.CharacterInput.service.CharacterService;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@Autowired
	CharacterService service;
	
	@GetMapping("/playerCharacter")
	public String characterForm(Model model) {
		PlayerCharacter playerCharacter = new PlayerCharacter();
		playerCharacter.setDemographics(new Demographics());
		playerCharacter.setProficiencies(new Proficiencies());
		playerCharacter.setStatBlock(new StatBlock());
		playerCharacter.setGear(new Gear());
		playerCharacter.setSurvival(new Survival());
		playerCharacter.setClassStats(new ClassStats());
		model.addAttribute("playerCharacter", playerCharacter);
		return "playerCharacter";
	}
	
	@PostMapping("/playerCharacter")
	public String characterInput(Model model, PlayerCharacter playerCharacter) {
		model.addAttribute("playerCharacter", playerCharacter);
		service.addCharacter(playerCharacter);
		return "result";
	}
	
	@PostMapping(value = "/playerCharacter", params = "addAlly")
	public String addAlly(PlayerCharacter playerCharacter, BindingResult bindingResult) {
		if(null!=playerCharacter) {
			if(null==playerCharacter.getProficiencies()) {
				playerCharacter.setProficiencies(new Proficiencies());
			}
			if(null==playerCharacter.getDemographics().getAlliesAndOrganizations()) {
				List<Ally> alliesList = new ArrayList<>();
				alliesList.add(new Ally());
				playerCharacter.getDemographics().setAlliesAndOrganizations(alliesList);
			} else {
				playerCharacter.getDemographics().getAlliesAndOrganizations().add(new Ally());
			}
		}
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "removeAlly")
	public String removeAlly(PlayerCharacter playerCharacter, BindingResult bindingResult, HttpServletRequest request) {
		if(null==playerCharacter.getProficiencies()) {
			playerCharacter.setProficiencies(new Proficiencies());
		} 
		playerCharacter.getDemographics().getAlliesAndOrganizations().remove(Integer.parseInt(request.getParameter("removeAlly")));
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "addSaveProficiency")
	public String addSaveProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult) {
		if(null!=playerCharacter) {
			if(null==playerCharacter.getProficiencies()) {
				playerCharacter.setProficiencies(new Proficiencies());
			} 
			if (null==playerCharacter.getProficiencies().getSaveProficiencies()){
				List<String> saveProficencyList = new ArrayList<>();
				saveProficencyList.add(new String());
				playerCharacter.getProficiencies().setSaveProficiencies(saveProficencyList);
			} else {
				playerCharacter.getProficiencies().getSaveProficiencies().add(new String());
			}
		}
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "removeSaveProficiency")
	public String removeSaveProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult, HttpServletRequest request) {
		playerCharacter.getProficiencies().getSaveProficiencies().remove(Integer.parseInt(request.getParameter("removeSaveProficiency")));
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "addSkillProficiency")
	public String addSkillProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult) {
		if(null!=playerCharacter) {
			if(null==playerCharacter.getProficiencies()) {
				playerCharacter.setProficiencies(new Proficiencies());
			}
			if(null==playerCharacter.getProficiencies().getSkillProficiencies()) {
				List<String> skillProficencyList = new ArrayList<>();
				skillProficencyList.add(new String());
				playerCharacter.getProficiencies().setSkillProficiencies(skillProficencyList);
			} else {
				playerCharacter.getProficiencies().getSkillProficiencies().add(new String());
			}
		}
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "removeSkillProficiency")
	public String removeSkillProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult, HttpServletRequest request) {
		playerCharacter.getProficiencies().getSkillProficiencies().remove(Integer.parseInt(request.getParameter("removeSkillProficiency")));
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "addToolProficiency")
	public String addToolProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult) {
		if(null!=playerCharacter) {
			if(null==playerCharacter.getProficiencies()) {
				playerCharacter.setProficiencies(new Proficiencies());
			}
			if(null==playerCharacter.getProficiencies().getToolProficiencies()) {
				List<String> toolProficencyList = new ArrayList<>();
				toolProficencyList.add(new String());
				playerCharacter.getProficiencies().setToolProficiencies(toolProficencyList);
			} else {
				playerCharacter.getProficiencies().getToolProficiencies().add(new String());
			}
		}
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "removeToolProficiency")
	public String removeToolProficiency(PlayerCharacter playerCharacter, BindingResult bindingResult, HttpServletRequest request) {
		playerCharacter.getProficiencies().getToolProficiencies().remove(Integer.parseInt(request.getParameter("removeToolProficiency")));
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "addLanguage")
	public String addLanguage(PlayerCharacter playerCharacter, BindingResult bindingResult) {
		if(null!=playerCharacter) {
			if(null==playerCharacter.getProficiencies()) {
				playerCharacter.setProficiencies(new Proficiencies());
			}
			if(null==playerCharacter.getProficiencies().getLanguages()) {
				List<String> languageList = new ArrayList<>();
				languageList.add(new String());
				playerCharacter.getProficiencies().setLanguages(languageList);
			} else {
				playerCharacter.getProficiencies().getLanguages().add(new String());
			}
		}
		return "playerCharacter";
	}
	
	@PostMapping(value = "/playerCharacter", params = "removeLanguage")
	public String removeLanguage(PlayerCharacter playerCharacter, BindingResult bindingResult, HttpServletRequest request) {
		playerCharacter.getProficiencies().getLanguages().remove(Integer.parseInt(request.getParameter("removeLanguage")));
		return "playerCharacter";
	}
}
