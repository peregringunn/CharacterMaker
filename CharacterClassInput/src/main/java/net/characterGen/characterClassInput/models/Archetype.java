package net.characterGen.characterClassInput.models;

import java.util.List;

import lombok.Data;

@Data
public class Archetype {
	private String id;
	private String name;
	private String description;
	private List<ClassFeature> features;	
}
