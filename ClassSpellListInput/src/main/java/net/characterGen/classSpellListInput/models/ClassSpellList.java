package net.characterGen.classSpellListInput.models;

import java.util.List;

import lombok.Data;

@Data
public class ClassSpellList {
	private String className;
	private List<String> cantrips;
	private List<String> first;
	private List<String> second;
	private List<String> third;
	private List<String> fourth;
	private List<String> fith;
	private List<String> sixth;
	private List<String> seventh;
	private List<String> eighth;
	private List<String> ninth;
	
	public void addCantrips(String string) {
		this.cantrips.add(string);
	}
	
	public void addFirstLevelSpell(String string) {
		this.first.add(string);
	}
	
	public void addSecondLevelSpell(String string) {
		this.second.add(string);
	}
	
	public void addThirdLevelSpell(String string) {
		this.third.add(string);
	}
	
	public void addFourthLevelSpell(String string) {
		this.fourth.add(string);
	}
	
	public void addFithLevelSpell(String string) {
		this.fith.add(string);
	}
	
	public void addSixthLevelSpell(String string) {
		this.sixth.add(string);
	}
	
	public void addSeventhLevelSpell(String string) {
		this.seventh.add(string);
	}
	
	public void addEighthLevelSpell(String string) {
		this.eighth.add(string);
	}
	
	public void addNinthLevelSpell(String string) {
		this.ninth.add(string);
	}

	public void removeCantripAt(int index) {
		this.cantrips.remove(index);
	}

	public void removeFirstLevelSpellAt(int index) {
		this.first.remove(index);
	}

	public void removeSecondLevelSpellAt(int index) {
		this.second.remove(index);
	}

	public void removeThirdLevelSpellAt(int index) {
		this.third.remove(index);
	}

	public void removeFourthLevelSpellAt(int index) {
		this.fourth.remove(index);
	}

	public void removeFithLevelSpellAt(int index) {
		this.fith.remove(index);
	}

	public void removeSixthLevelSpellAt(int index) {
		this.sixth.remove(index);
	}

	public void removeSeventhLevelSpellAt(int index) {
		this.seventh.remove(index);
	}

	public void removeEighthLevelSpellAt(int index) {
		this.eighth.remove(index);
	}

	public void removeNinthLevelSpellAt(int index) {
		this.ninth.remove(index);
	}
}
