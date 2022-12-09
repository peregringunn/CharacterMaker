package net.characterGen.models;

import java.util.List;

public class Proficiencies {
	private List<String> saveProficencies;
	private List<String> skillProficencies;
	private List<String> toolProficencies;
	private List<String> languages;
	public Proficiencies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proficiencies(List<String> saveProficencies, List<String> skillProficencies, List<String> toolProficencies, List<String> languages) {
		super();
		this.saveProficencies = saveProficencies;
		this.skillProficencies = skillProficencies;
		this.toolProficencies = toolProficencies;
		this.languages = languages;
	}
	public List<String> getSaveProficencies() {
		return saveProficencies;
	}
	public void setSaveProficencies(List<String> saveProficencies) {
		this.saveProficencies = saveProficencies;
	}
	public List<String> getSkillProficencies() {
		return skillProficencies;
	}
	public void setSkillProficencies(List<String> skillProficencies) {
		this.skillProficencies = skillProficencies;
	}
	public List<String> getToolProficencies() {
		return toolProficencies;
	}
	public void setToolProficencies(List<String> toolProficencies) {
		this.toolProficencies = toolProficencies;
	}
	
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Proficiencies [saveProficencies=" + saveProficencies + ", skillProficencies=" + skillProficencies
				+ ", toolProficencies=" + toolProficencies + "]";
	}
	
}
