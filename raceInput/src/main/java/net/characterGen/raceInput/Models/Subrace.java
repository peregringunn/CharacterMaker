package net.characterGen.raceInput.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Subrace {
	private String name;
	private String parentRace;
	private List<ScoreBonus> scoreBonuses;
	private List<Feature> traits;
	
	public void addScoreBonus(ScoreBonus scoreBonus) {
		this.scoreBonuses.add(scoreBonus);
	}

	public void initializeScoreBonusList() {
		this.scoreBonuses = new ArrayList<>();
		this.scoreBonuses.add(new ScoreBonus());
	}

	public void removeScoreBonusAt(int index) {
		this.scoreBonuses.remove(index);
	}

	public void addTrait(Feature feature) {
		this.traits.add(feature);
	}

	public void initializeTraits() {
		this.traits = new ArrayList<>();
		this.traits.add(new Feature());
	}

	public void removeTraitAt(int index) {
		this.traits.remove(index);
	}
	
	
}
