package net.characterGen.backgroundinput.models;

import java.util.List;


public class Background {
	private String name;
	private List<String> proficiencies;
	private List<String> languages;
	private List<String> equipment;
	private Feature feature;
	private List<Charateristics> characteristics;
	public Background(String name, List<String> proficiencies, List<String> languages, List<String> equipment,
			Feature feature, List<Charateristics> characteristics) {
		super();
		this.name = name;
		this.proficiencies = proficiencies;
		this.languages = languages;
		this.equipment = equipment;
		this.feature = feature;
		this.characteristics = characteristics;
	}
	public Background() {
		super();
	}
	public String getName() {
		return name;
	}
	public List<String> getProficiencies() {
		return proficiencies;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public List<String> getEquipment() {
		return equipment;
	}
	public Feature getFeature() {
		return feature;
	}
	public List<Charateristics> getCharacteristics() {
		return characteristics;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setProficiencies(List<String> proficiencies) {
		this.proficiencies = proficiencies;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public void setEquipment(List<String> equipment) {
		this.equipment = equipment;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	public void setCharacteristics(List<Charateristics> list) {
		this.characteristics = list;
	}
	@Override
	public String toString() {
		return "Background [name=" + name + ", proficiencies=" + proficiencies + ", languages=" + languages
				+ ", equipment=" + equipment + ", feature=" + feature + ", characteristics=" + characteristics + "]";
	}
	
}
