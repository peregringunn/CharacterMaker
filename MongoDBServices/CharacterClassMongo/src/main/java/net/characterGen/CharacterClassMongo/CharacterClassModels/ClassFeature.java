package net.characterGen.CharacterClassMongo.CharacterClassModels;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ClassFeature {
	private String name;
	private int level;
	private String description;
}
