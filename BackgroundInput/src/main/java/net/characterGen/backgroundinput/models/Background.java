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
	private List<Charateristics> characteristics;	
}
