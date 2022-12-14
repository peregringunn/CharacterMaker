package net.characterGen.backgroundinput.models;

public class FormBackground {
	private String name;
	private String proficiencies;
	private String languages;
	private String equipment;
	private Feature feature;
	private String characteristics;
	public FormBackground() {
		super();
	}
	public FormBackground(String name, String proficiencies, String languages, String equipment, Feature feature,
			String characteristics) {
		super();
		this.name = name;
		this.proficiencies = proficiencies;
		this.languages = languages;
		this.equipment = equipment;
		this.feature = feature;
		this.characteristics = characteristics;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProficiencies() {
		return proficiencies;
	}
	public void setProficiencies(String proficiencies) {
		this.proficiencies = proficiencies;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	@Override
	public String toString() {
		return "FormBackground [name=" + name + ", proficiencies=" + proficiencies + ", languages=" + languages
				+ ", equipment=" + equipment + ", feature=" + feature + ", characteristics=" + characteristics + "]";
	}

	
}
