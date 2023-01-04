package net.characterGen.spellInput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.characterGen.spellInput.models.Spell;
import net.characterGen.spellInput.service.SpellService;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@Autowired
	SpellService service;
	
	@GetMapping("/spell")
	public String spellForm (Model model) {
		model.addAttribute("spell", new Spell());
		return "spell";
	}
	
	@PostMapping("/spell")
	public String spellInput (@ModelAttribute Spell spell, Model model) {
		model.addAttribute("spell", spell);
		service.addSpell(spell);
		return "spell";
	}
}
