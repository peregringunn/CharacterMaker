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
public class ClassStats {
	private List<String> name;
	private List<Integer> level;
	private List<String> subClass;
	private List<String> spellsKnown;
	private int experience;
	public ClassStats() {
		super();
		this.name = new ArrayList<>();
		this.level = new ArrayList<>();
		this.subClass = new ArrayList<>();
		this.spellsKnown = new ArrayList<>();
	}
	public ClassStats(List<String> name, List<Integer> level, List<String> subClass, List<String> spellsKnown,
			int experience) {
		super();
		this.name = name;
		this.level = level;
		this.subClass = subClass;
		this.spellsKnown = spellsKnown;
		this.experience = experience;
	}
}
