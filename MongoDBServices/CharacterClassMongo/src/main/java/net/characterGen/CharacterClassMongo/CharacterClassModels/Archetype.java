package net.characterGen.CharacterClassMongo.CharacterClassModels;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Archetype {
	@Id
	private String id;
	private String name;
	private String description;
	private List<ClassFeature> features;

	
	public Archetype() {
		super();
	}
	public Archetype(String id, String name, String description, List<ClassFeature> features) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.features = features;
	}
	public Archetype(String name, String description, List<ClassFeature> features) {
		super();
		this.name = name;
		this.description = description;
		this.features = features;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public List<ClassFeature> getFeatures() {
		return features;
	}
	@Override
	public String toString() {
		return "Archetype [name=" + name + ",\n description=" + description + ",\n features=" + features + "]";
	}
	
}
