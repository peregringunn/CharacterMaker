package net.characterGen.characterCreation.model;

import java.util.List;

import lombok.Data;

@Data
public class Race {
	private String name;
	private String age;
	private String alignment;
	private String size;
	private String sizeDescription;
	private int speed;
	private List<ScoreBonus> scoreBonuses;
	private List<String> proficiencies;
	private List<Feature> traits;
	private List<String> subraces;
}
