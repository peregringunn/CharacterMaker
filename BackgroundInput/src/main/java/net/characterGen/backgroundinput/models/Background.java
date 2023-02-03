package net.characterGen.backgroundinput.models;

import java.util.List;

import lombok.Data;

@Data
public class Background {
	private String name;
	private List<String> proficiencies;
	private List<String> languages;
	private List<String> equipment;
	private Feature feature;
	private List<String> personalityTraits;
	private List<String> ideals;
	private List<String> bonds;
	private List<String> flaws;
	
	public void removeProficiency(int parseInt) {
		this.proficiencies.remove(parseInt);
	}

	public void removeLanguage(int parseInt) {
		this.languages.remove(parseInt);
	}

	public void removeEquipment(int parseInt) {
		this.equipment.remove(parseInt);
	}

	public void removeIdeal(int parseInt) {
		this.ideals.remove(parseInt);
	}

	public void removeBond(int parseInt) {
		this.bonds.remove(parseInt);
	}
	
	public void removeFlaw(int parseInt) {
		this.flaws.remove(parseInt);		
	}

	public void addProficency(String string) {
		this.proficiencies.add(string);
	}

	public void addLanguge(String string) {
		this.languages.add(string);
	}

	public void addEquipment(String string) {
		this.equipment.add(string);
	}

	public void addBond(String string) {
		this.bonds.add(string);
	}

	public void addFlaw(String string) {
		this.flaws.add(string);
	}
}
