package net.characterGen.raceInput.Models;

import java.util.ArrayList;
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
	
	public void addScoreBonus(ScoreBonus scoreBonus) {
		this.scoreBonuses.add(scoreBonus);
	}
	
	public void initializeScoreBonuses() {
		this.scoreBonuses = new ArrayList<>();
		this.addScoreBonus(new ScoreBonus());
	}

	public void removeScoreBonusAt(int index) {
		this.scoreBonuses.remove(index);
	}

	public void addProficiency(String string) {
		this.proficiencies.add(string);		
	}

	public void initializeProficiencies() {
		this.proficiencies = initializeStringList();
	}

	public void removeProficiencyAt(int index) {
		this.proficiencies.remove(index);
	}
	
	public void addTrait(Feature feature) {
		this.traits.add(feature);
	}

	public void initializeTraits() {
		this.traits = new ArrayList<>();
		this.traits.add(new Feature());
	}

	public void removeTrait(int index) {
		this.traits.remove(index);
	}
	
	private List<String> initializeStringList() {
		List<String> list = new ArrayList<>();
		list.add("");
		return list;
	}

	public void addSubrace(String string) {
		this.subraces.add(string);
	}

	public void initializeSubrace() {
		this.subraces = initializeStringList();
	}

	public void removeSubraceAt(int index) {
		this.subraces.remove(index);
	}
}
