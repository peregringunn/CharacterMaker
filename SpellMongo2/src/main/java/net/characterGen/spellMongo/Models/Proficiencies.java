package net.characterGen.spellMongo.Models;

import java.util.List;

public class Proficiencies {
	private List<String> saveProficiencies;
	private List<String> skillProficiencies;
	private List<String> toolProficiencies;
	private List<String> languages;
	public Proficiencies() {
		super();
	}
	public Proficiencies(List<String> saveProficencies, List<String> skillProficencies, List<String> toolProficencies, List<String> languages) {
		super();
		this.saveProficiencies = saveProficencies;
		this.skillProficiencies = skillProficencies;
		this.toolProficiencies = toolProficencies;
		this.languages = languages;
	}
	public List<String> getSaveProficencies() {
		return saveProficiencies;
	}
	public void setSaveProficencies(List<String> saveProficencies) {
		this.saveProficiencies = saveProficencies;
	}
	public List<String> getSkillProficencies() {
		return skillProficiencies;
	}
	public void setSkillProficencies(List<String> skillProficencies) {
		this.skillProficiencies = skillProficencies;
	}
	public List<String> getToolProficencies() {
		return toolProficiencies;
	}
	public void setToolProficencies(List<String> toolProficencies) {
		this.toolProficiencies = toolProficencies;
	}
	
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Proficiencies [saveProficencies=" + saveProficiencies + ", skillProficencies=" + skillProficiencies
				+ ", toolProficencies=" + toolProficiencies + "]";
	}
	
}
