package net.characterGen.classSpellListMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClassSpellList {
	@Id
	private String id;
	private String className;
	private List<List<String>> spellListByLevel;
	public ClassSpellList() {
		super();
	}
	public ClassSpellList(String id, String className, List<List<String>> spellListByLevel) {
		super();
		this.id = id;
		this.className = className;
		this.spellListByLevel = spellListByLevel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<List<String>> getSpellListByLevel() {
		return spellListByLevel;
	}
	public void setSpellListByLevel(List<List<String>> spellListByLevel) {
		this.spellListByLevel = spellListByLevel;
	}
}
