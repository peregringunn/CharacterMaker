package net.characterGen.characterMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PlayerCharacter {
	@Id
	private String name;
	private String playerName;
	private String background;
	private String race;
	private String subrace;
	private String alignment;
	private int age;
	private String height;
	private String weight;
	private String eyes;
	private String skin;
	private String hair;
	private String appearence;
	private String backstory;
	private List<Ally> alliesAndOrganizations;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private List<String> saveProficiencies;
	private List<String> skillProficiencies;
	private List<String> toolProficiencies;
	private List<String> languages;
	private List<Attack> attacks;
	private List<String> equipment;
	private Money money;	
	private int armorClass;
	private int hitPointMax;
	private int currentHitPoints;
	private int temporaryHitPoints;
	private List<String> className;
	private List<Integer> level;
	private List<String> subClass;
	private List<String> spellsKnown;
	private int experience;
}
