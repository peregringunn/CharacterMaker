package net.characterGen.CharacterClassMongo.CharacterClassModels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClassFeature {
	@Id
	private String id;
	private String name;
	private int level;
	private String description;

	
	public ClassFeature() {
		super();
	}
	public ClassFeature(String id, String name, int level, String description) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.description = description;
	}
	public ClassFeature(String name, int level, String description) {
		super();
		this.name = name;
		this.level = level;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "ClassFeature [name=" + name + ",\n level=" + level + ",\n Description=" + description + "]";
	}
}
