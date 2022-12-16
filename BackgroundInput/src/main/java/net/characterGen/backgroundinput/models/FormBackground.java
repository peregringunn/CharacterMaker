package net.characterGen.backgroundinput.models;

import java.util.List;

import lombok.Data;

@Data
public class FormBackground {
	private String name;
	private List<String> proficiencies;
	private String languages;
	private String equipment;
	private Feature feature;
	private List<Charateristics> characteristics;
	
}
