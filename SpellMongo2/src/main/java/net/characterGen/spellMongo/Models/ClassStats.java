package net.characterGen.spellMongo.Models;

import java.util.List;
import java.util.Map;

public class ClassStats {
    private List<Map<String,Integer>> characterClasses;
	private List<String> subclass;
	private List<String> spellsKnown;
	private int experiance;
	public ClassStats(List<Map<String, Integer>> characterClasses, List<String> subclass, List<String> spellsKnown,
			int experience) {
		super();
		this.characterClasses = characterClasses;
		this.subclass = subclass;
		this.spellsKnown = spellsKnown;
		this.experiance = experience;
	}
	public ClassStats() {
		super();
	}
	public List<Map<String, Integer>> getCharacterClasses() {
		return characterClasses;
	}
	public void setCharacterClasses(List<Map<String, Integer>> characterClasses) {
		this.characterClasses = characterClasses;
	}
	public List<String> getSubclass() {
		return subclass;
	}
	public void setSubclass(List<String> subclass) {
		this.subclass = subclass;
	}
	public List<String> getSpellsKnown() {
		return spellsKnown;
	}
	public void setSpellsKnown(List<String> spellsKnown) {
		this.spellsKnown = spellsKnown;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "ClassStats [CharacterClasses=" + characterClasses + ", subclass=" + subclass + ", spellsKnown="
				+ spellsKnown + ", experiance=" + experiance + "]";
	}
	
}
