package net.characterGen.classSpellListInput.controller;

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
	
	@PostMapping("classSpellList")
	public String spellListInput(@ModelAttribute ClassSpellList classSpellList, Model model) {
		model.addAttribute("classSpellList", classSpellList);
		service.addSpellList(classSpellList);
		return "result";
	}
	
	@PostMapping(value = "classSpellList", params = {"addCantrip"})
	public String addCantrip(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getCantrips()) {
				List<String> cantripList = new ArrayList<>();
				cantripList.add(new String());
				classSpellList.setCantrips(cantripList);
			} else {
				classSpellList.getCantrips().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeCantrip"})
	public String removeCantrip(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getCantrips().remove(Integer.parseInt(request.getParameter("removeCantrip")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addFirst"})
	public String addFirst(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getFirst()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setFirst(levelList);
			} else {
				classSpellList.getFirst().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeFirst"})
	public String removeFirst(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getFirst().remove(Integer.parseInt(request.getParameter("removeFirst")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addSecond"})
	public String addSecond(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getSecond()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setSecond(levelList);
			} else {
				classSpellList.getSecond().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeSecond"})
	public String removeSecond(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getSecond().remove(Integer.parseInt(request.getParameter("removeSecond")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addThird"})
	public String addThird(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getThird()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setThird(levelList);
			} else {
				classSpellList.getThird().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeThird"})
	public String removeThird(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getThird().remove(Integer.parseInt(request.getParameter("removeThird")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addFourth"})
	public String addFourth(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getFourth()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setFourth(levelList);
			} else {
				classSpellList.getFourth().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeFourth"})
	public String removeFourth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getFourth().remove(Integer.parseInt(request.getParameter("removeFourth")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addFith"})
	public String addFith(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getFith()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setFith(levelList);
			} else {
				classSpellList.getFith().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeFith"})
	public String removeFith(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getFith().remove(Integer.parseInt(request.getParameter("removeFith")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addSixth"})
	public String addSixth(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getSixth()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setSixth(levelList);
			} else {
				classSpellList.getSixth().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeSixth"})
	public String removeSixth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getSixth().remove(Integer.parseInt(request.getParameter("removeSixth")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addSeventh"})
	public String addSeventh(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getSeventh()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setSeventh(levelList);
			} else {
				classSpellList.getSeventh().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeSeventh"})
	public String removeSeventh(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getSeventh().remove(Integer.parseInt(request.getParameter("removeSeventh")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addEighth"})
	public String addEighth(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getEighth()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setEighth(levelList);
			} else {
				classSpellList.getEighth().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeEighth"})
	public String removeEighth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getEighth().remove(Integer.parseInt(request.getParameter("removeEighth")));
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"addNinth"})
	public String addNinth(ClassSpellList classSpellList, BindingResult bindingResult) {
		if (null!=classSpellList) {
			if (null==classSpellList.getNinth()) {
				List<String> levelList = new ArrayList<>();
				levelList.add(new String());
				classSpellList.setNinth(levelList);
			} else {
				classSpellList.getNinth().add(new String());
			}
		}
		return "classSpellList";
	}
	
	@PostMapping(value = "classSpellList", params = {"removeNinth"})
	public String removeNinth(ClassSpellList classSpellList, BindingResult bindingResult, HttpServletRequest request) {
		classSpellList.getNinth().remove(Integer.parseInt(request.getParameter("removeNinth")));
		return "classSpellList";
	}
}
