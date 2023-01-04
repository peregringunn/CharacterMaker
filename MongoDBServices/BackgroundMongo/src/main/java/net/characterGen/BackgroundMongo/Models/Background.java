package net.characterGen.BackgroundMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Background {
	@Id
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
