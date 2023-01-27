package net.characterGen.characterMongo.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Proficiencies {
	private List<String> saveProficiencies;
	private List<String> skillProficiencies;
	private List<String> toolProficiencies;
	private List<String> languages;
	public Proficiencies() {
		super();
		this.languages = new ArrayList<>();
		this.skillProficiencies = new ArrayList<>();
		this.saveProficiencies = new ArrayList<>();
		this.toolProficiencies = new ArrayList<>();
	}
	public Proficiencies(List<String> saveProficiencies, List<String> skillProficiencies,
			List<String> toolProficiencies, List<String> languages) {
		super();
		this.saveProficiencies = saveProficiencies;
		this.skillProficiencies = skillProficiencies;
		this.toolProficiencies = toolProficiencies;
		this.languages = languages;
	}
}
