package net.characterGen.RaceMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ScoreBonus {
	public ScoreBonus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String id;
	private String scoreName;
	private int bonus;
	public ScoreBonus(String id,String scoreName, int bonus) {
		super();
		this.id = id;
		this.scoreName = scoreName;
		this.bonus = bonus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getScoreName() {
		return scoreName;
	}
	public int getBonus() {
		return bonus;
	}
}
