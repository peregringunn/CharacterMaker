package net.characterGen.spellMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Spell {
	@Id
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
