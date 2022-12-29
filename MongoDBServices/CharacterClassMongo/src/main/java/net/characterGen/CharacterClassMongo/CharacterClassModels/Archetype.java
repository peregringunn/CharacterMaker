package net.characterGen.CharacterClassMongo.CharacterClassModels;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Archetype {
	private String name;
	private String description;
	private List<ClassFeature> features;
	
}
