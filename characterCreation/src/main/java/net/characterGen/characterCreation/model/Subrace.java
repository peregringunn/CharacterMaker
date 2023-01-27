package net.characterGen.characterCreation.model;

import java.util.List;

import lombok.Data;

@Data
public class Subrace {
	private String name;
	private String parentRace;
	private List<ScoreBonus> scoreBonuses;
	private List<Feature> traits;
}
