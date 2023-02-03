package net.characterGen.characterClassInput.controller;

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
import net.characterGen.characterClassInput.models.Archetype;
import net.characterGen.characterClassInput.models.CharacterClass;
import net.characterGen.characterClassInput.models.ClassFeature;
import net.characterGen.characterClassInput.service.CharacterClassService;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
	
	@Autowired
	CharacterClassService service;
	
	@GetMapping("/characterClass")
	public String characterClassForm(Model model) {
		model.addAttribute("characterClass", new CharacterClass());
		return "characterClass";
	}
	
	@PostMapping("/characterClass")
	public String characterClassInput(@ModelAttribute CharacterClass characterClass, Model model) {
		model.addAttribute("characterClass", characterClass);
		service.addCharacterClass(characterClass);
		return "result";
	}
	
	@PostMapping(value = "/characterClass", params = {"addWeaponProficiency"})
	public String addWeaponProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addWeponProficiency("");
		} catch (NullPointerException e) {
			characterClass.setWeaponProficiencies(service.intializeStringList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeWeaponProficiency"})
	public String removeWeaponProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeWeaponProficiency"));
		characterClass.removeWeaponProficiency(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArmorProficiency"})
	public String addArmorProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addArmorProficiency("");
		} catch (NullPointerException e) {
			characterClass.setArmorProficiencies(service.intializeStringList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeArmorProficiency"})
	public String removeArmorProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeArmorProficiency"));
		characterClass.removeArmorProficiency(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addToolProficiency"})
	public String addToolProficiency(CharacterClass characterClass, BindingResult bindingResult) {
				try {
					characterClass.addToolProficiency("");
				} catch (NullPointerException e) {
					characterClass.setToolProficiencies(service.intializeStringList());
				}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeToolProficiency"})
	public String removetoolProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeToolProficiency"));
		characterClass.removeToolProficiency(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addSkillProficiency"})
	public String addSkillProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addSkillProficiency("");
		} catch (NullPointerException e) {
			characterClass.setSkillProficiencies(service.intializeStringList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSkillProficiency"})
	public String removeSkillProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSkillProficiency"));
		characterClass.removeSkillProficiency(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addSavingThrowProficiency"})
	public String addSavingThrowProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addSavingThrowProficiency("");
		} catch (NullPointerException e) {
			characterClass.setSavingThrowProficiencies(service.intializeStringList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSavingThrowProficiency"})
	public String removeSavingThrowProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSavingThrowProficiency"));
		characterClass.removeSavingThrowProficiency(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addClassFeature"})
	public String addSavingClassFeature(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addClassFeatures(new ClassFeature());
		} catch (NullPointerException e) {
			characterClass.setClassFeatures(service.intializeClassFeatureList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeClassFeature"})
	public String removeClassFeature (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeClassFeature"));
		characterClass.removeClassFeature(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArchetype"})
	public String addArchetype(CharacterClass characterClass, BindingResult bindingResult) {
		try {
			characterClass.addArchetypes(new Archetype());
		} catch (Exception e) {
			characterClass.setArchetypes(service.intializeArchetypeList());
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeArchetype"})
	public String removeArchetype (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeArchetype"));
		characterClass.removeArchetype(index);
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArchetypeFeature"})
	public String addArchetypeFeature(CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("addArchetypeFeature"));
		try {
			characterClass.addArchetypeFeature(parseInt, new ClassFeature());
		} catch (NullPointerException e) {
		    characterClass.initializeArchetypeFeatureList(parseInt, service.intializeClassFeatureList());
		}
		return "characterClass";
	}
		
	@PostMapping(value = "/characterClass", params = {"addSpellsKnown"})
	public String addSpellsKnown(CharacterClass characterClass, BindingResult bindingResult) {
		if(null==characterClass.getSpellsKnown()) {
			List<Integer> spellsKnownList = new ArrayList<>();
			for (int i = 0; i < 20; i++) {
				spellsKnownList.add(0);
			}
			characterClass.setSpellsKnown(spellsKnownList);
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSpellsKnown"})
	public String removeSpellsKnown (CharacterClass characterClass, BindingResult bindingResult) {
		if (null!=characterClass.getSpellsKnown()) {
			for (int i = 20; i > 0; i--) {
				characterClass.getSpellsKnown().remove(i-1);
			} 
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addSpellSlotsPerLevel"})
	public String addSpellSlotsPerLeve(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getSpellSlotsPerLevel()) {
				List<List<Integer>> spellSlotsList = new ArrayList<>();
				for (int i = 0; i < 20; i++) {
					List<Integer> levelList = new ArrayList<>();
					for(int j=0; j < 9; j++) {
						levelList.add(0);
					}
					spellSlotsList.add(levelList);
				}
				characterClass.setSpellSlotsPerLevel(spellSlotsList);
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSpellSlotsPerLevel"})
	public String removeClassFeature (CharacterClass characterClass, BindingResult bindingResult) {
		if (null!=characterClass.getSpellSlotsPerLevel()) {
			for (int i = 20; i > 0; i--) {
				characterClass.getSpellSlotsPerLevel().remove(i-1);
			} 
		}
		return "characterClass";
	}
}
