package net.characterGen.spellMongo.Models;

import java.util.List;
import java.util.Map;

public class Demographics {
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
	private List<Map<String,String>> alliesAndOrganizations;
	
	public Demographics(String background, String race, String subrace, String alignment, int age, String height,
			String weight, String eyes, String skin, String hair, String appearence, String backstory,
			List<Map<String, String>> alliesAndOrganizations) {
		super();
		this.background = background;
		this.race = race;
		this.subrace = subrace;
		this.alignment = alignment;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyes = eyes;
		this.skin = skin;
		this.hair = hair;
		this.appearence = appearence;
		this.backstory = backstory;
		this.alliesAndOrganizations = alliesAndOrganizations;
	}
	public Demographics() {
		super();
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSubrace() {
		return subrace;
	}
	public void setSubrace(String subrace) {
		this.subrace = subrace;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getAppearence() {
		return appearence;
	}
	public void setAppearence(String appearence) {
		this.appearence = appearence;
	}
	public String getBackstory() {
		return backstory;
	}
	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}
	public List<Map<String, String>> getAlliesAndOrganizations() {
		return alliesAndOrganizations;
	}
	public void setAlliesAndOrganizations(List<Map<String, String>> alliesAndOrganizations) {
		this.alliesAndOrganizations = alliesAndOrganizations;
	}
	@Override
	public String toString() {
		return "Demographics [background=" + background + ", race=" + race + ", subrace=" + subrace + ", Alignment="
				+ alignment + ", age=" + age + ", height=" + height + ", weight=" + weight + ", eyes=" + eyes
				+ ", skin=" + skin + ", hair=" + hair + ", appearence=" + appearence + ", backstory=" + backstory
				+ ", alliesAndOrganizations=" + alliesAndOrganizations + "]";
	}
	
	
}
