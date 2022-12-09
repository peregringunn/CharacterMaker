package net.characterGen.CharacterClassMongo.CharacterClassModels;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CharacterClass {
	
	@Id
	private String id;
	
	private String name;
	private int hitDie;
	private List<String> weaponProficiencies;
	private List<String> armorProficiencies;
	private List<String> toolProficiencies;
	private List<String> skillProficencies;
	private List<String> savingThrowProficiencies;
	private List<ClassFeature> classFeatures;
	private List<Archetype> archetypes;
	private String archetypeMetaName;
	private int spellCastingAbility;
	private int cantripsKnown;
	private int spellsKnown;
	private int[][] spellSlotsPerLevel;
	public CharacterClass() {
		super();
	}

	public CharacterClass(String id, String name, int hitDie, List<String> weaponProficiencies,
			List<String> armorProficiencies, List<String> toolProficiencies, List<String> skillProficencies,
			List<String> savingThrowProficiencies, List<ClassFeature> classFeatures, List<Archetype> archetypes,
			String archetypeMetaName, int spellCastingAbility, int cantripsKnown, int spellsKnown,
			int[][] spellSlotsPerLevel) {
		super();
		this.id = id;
		this.name = name;
		this.hitDie = hitDie;
		this.weaponProficiencies = weaponProficiencies;
		this.armorProficiencies = armorProficiencies;
		this.toolProficiencies = toolProficiencies;
		this.skillProficencies = skillProficencies;
		this.savingThrowProficiencies = savingThrowProficiencies;
		this.classFeatures = classFeatures;
		this.archetypes = archetypes;
		this.archetypeMetaName = archetypeMetaName;
		this.setSpellCastingAbility(spellCastingAbility);
		this.cantripsKnown = cantripsKnown;
		this.spellsKnown = spellsKnown;
		this.spellSlotsPerLevel = spellSlotsPerLevel;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getHitDie() {
		return hitDie;
	}
	public List<String> getWeaponProficiencies() {
		return weaponProficiencies;
	}
	public List<String> getArmorProficiencies() {
		return armorProficiencies;
	}
	public List<String> getToolProficiencies() {
		return toolProficiencies;
	}
	public List<String> getSkillProficencies() {
		return skillProficencies;
	}
	public List<String> getSavingThrowProficiencies() {
		return savingThrowProficiencies;
	}
	public List<ClassFeature> getClassFeatures() {
		return classFeatures;
	}
	public List<Archetype> getArchetypes() {
		return archetypes;
	}
	public String getArchetypeMetaName() {
		return archetypeMetaName;
	}
	public int getCantripsKnown() {
		return cantripsKnown;
	}
	public int getSpellsKnown() {
		return spellsKnown;
	}
	public int[][] getSpellSlotsPerLevel() {
		return spellSlotsPerLevel;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHitDie(int hitDie) {
		this.hitDie = hitDie;
	}
	public void setWeaponProficiencies(List<String> weaponProficiencies) {
		this.weaponProficiencies = weaponProficiencies;
	}
	public void setArmorProficiencies(List<String> armorProficiencies) {
		this.armorProficiencies = armorProficiencies;
	}
	public void setToolProficiencies(List<String> toolProficiencies) {
		this.toolProficiencies = toolProficiencies;
	}
	public void setSkillProficencies(List<String> skillProficencies) {
		this.skillProficencies = skillProficencies;
	}
	public void setSavingThrowProficiencies(List<String> savingThrowProficiencies) {
		this.savingThrowProficiencies = savingThrowProficiencies;
	}
	public void setClassFeatures(List<ClassFeature> classFeatures) {
		this.classFeatures = classFeatures;
	}
	public void setArchetypes(List<Archetype> archetypes) {
		this.archetypes = archetypes;
	}
	public void setArchetypeMetaName(String archetypeMetaName) {
		this.archetypeMetaName = archetypeMetaName;
	}
	public void setCantripsKnown(int cantripsKnown) {
		this.cantripsKnown = cantripsKnown;
	}
	public void setSpellsKnown(int spellsKnown) {
		this.spellsKnown = spellsKnown;
	}
	public void setSpellSlotsPerLevel(int[][] spellSlots) {
		this.spellSlotsPerLevel = spellSlots;
	}
	@Override
	public String toString() {
		return "CharacterClass [id=" + id + ",\n name=" + name + ",\n hitDie=" + hitDie + ",\n weaponProficiencies="
				+ weaponProficiencies + ",\n armorProficiencies=" + armorProficiencies + ",\n toolProficiencies="
				+ toolProficiencies + ",\n skillProficencies=" + skillProficencies + ",\n savingThrowProficiencies="
				+ savingThrowProficiencies + ",\n classFeatures=" + classFeatures + ",\n archetypes=" + archetypes
				+ ",\n archetypeMetaName=" + archetypeMetaName + "\n Spell Casting Abillity" + spellCastingAbility
				+ ",\n cantripsKnown=" + cantripsKnown + ",\n spellsKnown="
				+ spellsKnown + ",\n spellSlotsPerLevel=\n" + spellSlotsToString() + "]";
	}
	
	public String spellSlotsToString() {
		String str = "";
		for (int i=0;i<spellSlotsPerLevel.length;i++) {
			str = str + Arrays.toString(spellSlotsPerLevel[i]) + "\n";
		}
		return str;
	}

	public int getSpellCastingAbility() {
		return spellCastingAbility;
	}

	public void setSpellCastingAbility(int spellCastingAbility) {
		this.spellCastingAbility = spellCastingAbility;
	}
}
