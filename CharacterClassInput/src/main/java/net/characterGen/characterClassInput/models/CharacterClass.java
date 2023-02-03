package net.characterGen.characterClassInput.models;

import java.util.List;

import lombok.Data;

@Data
public class CharacterClass {
	
	
	
	private String name;
	private int hitDie;
	private List<String> weaponProficiencies;
	private List<String> armorProficiencies;
	private List<String> toolProficiencies;
	private List<String> skillProficiencies;
	private List<String> savingThrowProficiencies;
	private List<ClassFeature> classFeatures;
	private List<Archetype> archetypes;
	private String archetypeMetaName;
	private String spellCastingAbility;
	private List<Integer> cantripsKnown;
	private List<Integer> spellsKnown;
	private List<List<Integer>> spellSlotsPerLevel;
	
	public void addWeponProficiency(String string) {
		this.weaponProficiencies.add(string);		
	}

	public void addArmorProficiency(String string) {
		this.armorProficiencies.add(string);
	}

	public void addToolProficiency(String string) {
		this.toolProficiencies.add(string);	
	}

	public void addSkillProficiency(String string) {
		this.skillProficiencies.add(string);		
	}

	public void addSavingThrowProficiency(String string) {
		this.savingThrowProficiencies.add(string);
	}

	public void addClassFeatures(ClassFeature classFeature) {
		this.classFeatures.add(classFeature);
	}

	public void addArchetypes(Archetype archetype) {
		this.archetypes.add(archetype);
	}

	public void addArchetypeFeature(int parseInt, ClassFeature classFeature) {
		this.archetypes.get(parseInt).addFeature(classFeature);
	}

	public void initializeArchetypeFeatureList(int parseInt, List<ClassFeature> intializeClassFeatureList) {
		this.archetypes.get(parseInt).setFeatures(intializeClassFeatureList);
	}

	public void removeWeaponProficiency(int index) {
		this.weaponProficiencies.remove(index);
	}

	public void removeArmorProficiency(int index) {
		this.armorProficiencies.remove(index);
	}

	public void removeToolProficiency(int index) {
		this.toolProficiencies.remove(index);
	}

	public void removeSkillProficiency(int index) {
		this.skillProficiencies.remove(index);
	}

	public void removeSavingThrowProficiency(int index) {
		this.savingThrowProficiencies.remove(index);
	}

	public void removeClassFeature(int index) {
		this.classFeatures.remove(index);
	}

	public void removeArchetype(int index) {
		this.archetypes.remove(index);
	}

	public void removeArchetypeFeature(int archetypeIndex, int featureIndex) {
		this.archetypes.get(archetypeIndex).removeFeature(featureIndex);
	}
}

