package net.characterGen.characterClassInput.models;

import java.util.List;

import lombok.Data;

@Data
public class CharacterClass {
	private String id;	
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
	private int spellCastingAbility;
	private int cantripsKnown;
	private int spellsKnown;
	private int[][] spellSlotsPerLevel;
}
