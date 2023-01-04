package net.characterGen.spellInput.models;

import lombok.Data;

@Data
public class Spell {
	private String name;
	private int spellLevel;
	private String school;
	private boolean ritual;
	private boolean concentration;
	private String componets;
	private boolean costlyComponet;
	private String castingTime;
	private String duration;
	private String save;
	private String range;
	private String areaOfEffect;
	private String targets;
	private String description;
}
