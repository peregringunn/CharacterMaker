package net.characterGen.backgroundinput.models;

import java.util.List;

import lombok.Data;

@Data
public class Background {
	private String name;
	private List<String> proficiencies;
	private List<String> languages;
	private List<String> equipment;
	private Feature feature;
	private List<String> personalityTraits;
	private List<String> ideals;
	private List<String> bonds;
	private List<String> flaws;	
}
