package net.characterGen.CharacterClassMongo.CharacterClassModels;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class CharacterClass {
	
	@Id
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
}
