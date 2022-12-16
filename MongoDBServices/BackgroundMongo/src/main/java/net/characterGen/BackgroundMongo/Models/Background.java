package net.characterGen.BackgroundMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Background {
	@Id
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
	@Override
	public String toString() {
		return "Background [name=" + name + ", proficiencies=" + proficiencies + ", languages=" + languages
				+ ", equipment=" + equipment + ", feature=" + feature + ", characteristics=" + characteristics + "]";
	}
	
}
