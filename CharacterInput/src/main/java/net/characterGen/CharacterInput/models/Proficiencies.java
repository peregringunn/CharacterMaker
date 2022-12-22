package net.characterGen.CharacterInput.models;

import java.util.List;

import lombok.Data;

@Data
public class Proficiencies {
	private List<String> saveProficiencies;
	private List<String> skillProficiencies;
	private List<String> toolProficiencies;
	private List<String> languages;
}
