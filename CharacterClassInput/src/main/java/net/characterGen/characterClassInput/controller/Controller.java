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
		if(null!=characterClass) {
			if(null==characterClass.getWeaponProficiencies()) {
				List<String> weaponProficienciesList = new ArrayList<>();
				weaponProficienciesList.add(new String());
				characterClass.setWeaponProficiencies(weaponProficienciesList);
			} else {
				characterClass.getWeaponProficiencies().add(new String());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeWeaponProficiency"})
	public String removeWeaponProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getWeaponProficiencies().remove(Integer.parseInt(request.getParameter("removeWeaponProficiency")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArmorProficiency"})
	public String addArmorProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getArmorProficiencies()) {
				List<String> armorProficienciesList = new ArrayList<>();
				armorProficienciesList.add(new String());
				characterClass.setArmorProficiencies(armorProficienciesList);
			} else {
				characterClass.getArmorProficiencies().add(new String());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeArmorProficiency"})
	public String removeArmorProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getArmorProficiencies().remove(Integer.parseInt(request.getParameter("removeArmorProficiency")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addToolProficiency"})
	public String addToolProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getToolProficiencies()) {
				List<String> toolProficienciesList = new ArrayList<>();
				toolProficienciesList.add(new String());
				characterClass.setToolProficiencies(toolProficienciesList);
			} else {
				characterClass.getToolProficiencies().add(new String());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeToolProficiency"})
	public String removetoolProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getToolProficiencies().remove(Integer.parseInt(request.getParameter("removeToolProficiency")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addSkillProficiency"})
	public String addSkillProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getSkillProficiencies()) {
				List<String> skillProficienciesList = new ArrayList<>();
				skillProficienciesList.add(new String());
				characterClass.setSkillProficiencies(skillProficienciesList);
			} else {
				characterClass.getSkillProficiencies().add(new String());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSkillProficiency"})
	public String removeSkillProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getSkillProficiencies().remove(Integer.parseInt(request.getParameter("removeSkillProficiency")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addSavingThrowProficiency"})
	public String addSavingThrowProficiency(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getSavingThrowProficiencies()) {
				List<String> savingThrowProficienciesList = new ArrayList<>();
				savingThrowProficienciesList.add(new String());
				characterClass.setSavingThrowProficiencies(savingThrowProficienciesList);
			} else {
				characterClass.getSavingThrowProficiencies().add(new String());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeSavingThrowProficiency"})
	public String removeSavingThrowProficiency (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getSavingThrowProficiencies().remove(Integer.parseInt(request.getParameter("removeSavingThrowProficiency")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addClassFeature"})
	public String addSavingClassFeature(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getClassFeatures()) {
				List<ClassFeature> classFeaturesList = new ArrayList<>();
				classFeaturesList.add(new ClassFeature());
				characterClass.setClassFeatures(classFeaturesList);
			} else {
				characterClass.getClassFeatures().add(new ClassFeature());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeClassFeature"})
	public String removeClassFeature (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getClassFeatures().remove(Integer.parseInt(request.getParameter("removeClassFeature")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArchetype"})
	public String addArchetype(CharacterClass characterClass, BindingResult bindingResult) {
		if(null!=characterClass) {
			if(null==characterClass.getArchetypes()) {
				List<Archetype> archetypeList = new ArrayList<>();
				archetypeList.add(new Archetype());
				characterClass.setArchetypes(archetypeList);
			} else {
				characterClass.getArchetypes().add(new Archetype());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeArchetype"})
	public String removeArchetype (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getArchetypes().remove(Integer.parseInt(request.getParameter("removeArchetype")));
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"addArchetypeFeature"})
	public String addArchetypeFeature(CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		if(null!=characterClass) {
			if(null==characterClass.getArchetypes().get(Integer.parseInt(request.getParameter("addArchetypeFeature"))).getFeatures()) {
				List<ClassFeature> archetypeFeaturesList = new ArrayList<>();
				archetypeFeaturesList.add(new ClassFeature());
				characterClass.getArchetypes().get(Integer.parseInt(request.getParameter("addArchetypeFeature"))).setFeatures(archetypeFeaturesList);
			} else {
				characterClass.getArchetypes().get(Integer.parseInt(request.getParameter("addArchetypeFeature"))).getFeatures().add(new ClassFeature());
			}
		}
		return "characterClass";
	}
	
	@PostMapping(value = "/characterClass", params = {"removeArchetypeFeature"})
	public String removeArchetypeFeature (CharacterClass characterClass, BindingResult bindingResult, HttpServletRequest request) {
		characterClass.getArchetypes().get(Integer.parseInt(request.getParameter("archetypeIndex"))).getFeatures().remove(Integer.parseInt(request.getParameter("removeArchetypeFeature")));
		return "characterClass";
	}
}
