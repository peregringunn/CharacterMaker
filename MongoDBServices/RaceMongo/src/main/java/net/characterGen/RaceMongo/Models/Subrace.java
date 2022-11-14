package net.characterGen.RaceMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subrace {
	public Subrace() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String id;
	private String name;
	private List<ScoreBonus> scoreBonuses;
	private List<Feature> traits;
	public Subrace(String id, String name, List<ScoreBonus> scoreBonuses, List<Feature> traits) {
		super();
		this.id = id;
		this.name = name;
		this.scoreBonuses = scoreBonuses;
		this.traits = traits;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScoreBonuses(List<ScoreBonus> scoreBonuses) {
		this.scoreBonuses = scoreBonuses;
	}
	public void setTraits(List<Feature> traits) {
		this.traits = traits;
	}
	public String getName() {
		return name;
	}
	public List<ScoreBonus> getScoreBonuses() {
		return scoreBonuses;
	}
	public List<Feature> getTraits() {
		return traits;
	}
}
