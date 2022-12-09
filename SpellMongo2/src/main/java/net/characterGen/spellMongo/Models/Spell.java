package net.characterGen.spellMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Spell {
	@Id
	private String id;
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
	public Spell() {
		super();
	}
	public Spell(String id, String name, int spellLevel, String school, boolean ritual, boolean concentration, String componets,
			boolean costlyComponet, String castingTime, String duration, String save, String range, String areaOfEffect,
			String targets, String description) {
		super();
		this.id = id;
		this.name = name;
		this.spellLevel = spellLevel;
		this.school = school;
		this.ritual = ritual;
		this.concentration = concentration;
		this.componets = componets;
		this.costlyComponet = costlyComponet;
		this.castingTime = castingTime;
		this.duration = duration;
		this.save = save;
		this.range = range;
		this.areaOfEffect = areaOfEffect;
		this.targets = targets;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpellLevel() {
		return spellLevel;
	}
	public void setSpellLevel(int spellLevel) {
		this.spellLevel = spellLevel;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public boolean isRitual() {
		return ritual;
	}
	public void setRitual(boolean ritual) {
		this.ritual = ritual;
	}
	public boolean isConcentration() {
		return concentration;
	}
	public void setConcentration(boolean concentration) {
		this.concentration = concentration;
	}
	public String getComponets() {
		return componets;
	}
	public void setComponets(String componets) {
		this.componets = componets;
	}
	public boolean isCostlyComponet() {
		return costlyComponet;
	}
	public void setCostlyComponet(boolean costlyComponet) {
		this.costlyComponet = costlyComponet;
	}
	public String getCastingTime() {
		return castingTime;
	}
	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getAreaOfEffect() {
		return areaOfEffect;
	}
	public void setAreaOfEffect(String areaOfEffect) {
		this.areaOfEffect = areaOfEffect;
	}
	public String getTargets() {
		return targets;
	}
	public void setTargets(String targets) {
		this.targets = targets;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}