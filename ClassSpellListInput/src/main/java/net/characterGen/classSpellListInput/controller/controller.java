package net.characterGen.classSpellListInput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import net.characterGen.classSpellListInput.models.ClassSpellList;
import net.characterGen.classSpellListInput.service.SpellListService;

@Controller
@RequestMapping
public class controller {

	@Autowired
	SpellListService service;
	
	@GetMapping("/classSpellList")
	public String spellListForm(Model model) {
		model.addAttribute("classSpellList", new ClassSpellList());
		return "classSpellList";
	}
	
	@PostMapping("/classSpellList")
	public String spellListInput(@ModelAttribute ClassSpellList classSpellList, Model model) {
		model.addAttribute("classSpellList", classSpellList);
		service.addSpellList(classSpellList);
		return "result";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addCantrip"})
	public String addCantrip(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addCantrips(new String());
		} catch (NullPointerException e) {
			classSpellList.setCantrips(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeCantrip"})
	public String removeCantrip(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeCantrip"));
		classSpellList.removeCantripAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addFirst"})
	public String addFirst(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addFirstLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setFirst(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeFirst"})
	public String removeFirst(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeFirst"));
		classSpellList.removeFirstLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addSecond"})
	public String addSecond(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addSecondLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setSecond(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeSecond"})
	public String removeSecond(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSecond"));
		classSpellList.removeSecondLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addThird"})
	public String addThird(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addThirdLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setThird(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeThird"})
	public String removeThird(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeThird"));
		classSpellList.removeThirdLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addFourth"})
	public String addFourth(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addFourthLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setFourth(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeFourth"})
	public String removeFourth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeFourth"));
		classSpellList.removeFourthLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addFith"})
	public String addFith(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addFithLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setFith(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeFith"})
	public String removeFith(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeFith"));
		classSpellList.removeFithLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addSixth"})
	public String addSixth(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addSixthLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setSixth(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeSixth"})
	public String removeSixth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSixth"));
		classSpellList.removeSixthLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addSeventh"})
	public String addSeventh(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addSeventhLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setSeventh(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeSeventh"})
	public String removeSeventh(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeSeventh"));
		classSpellList.removeSeventhLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addEighth"})
	public String addEighth(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addEighthLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setEighth(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeEighth"})
	public String removeEighth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeEighth"));
		classSpellList.removeEighthLevelSpellAt(index);
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"addNinth"})
	public String addNinth(ClassSpellList classSpellList, BindingResult bindingResult) {
		try {
			classSpellList.addNinthLevelSpell(new String());
		} catch (NullPointerException e) {
			classSpellList.setNinth(service.initializeStringList());
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "/classSpellList", params = {"removeNinth"})
	public String removeNinth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("removeNinth"));
		classSpellList.removeNinthLevelSpellAt(index);
		return "classSpellList";
	}
}
