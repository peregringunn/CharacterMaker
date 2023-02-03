package net.characterGen.characterClassInput.models;

import java.util.List;

import lombok.Data;

@Data
public class Archetype {
	private String name;
	private String description;
	private List<ClassFeature> features;
	
	public void addFeature(ClassFeature classFeature) {
		this.features.add(classFeature);
	}

	public void removeFeature(int featureIndex) {
		this.features.remove(featureIndex);
	}	
}
