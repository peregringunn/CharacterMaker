package net.characterGen.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PlayerCharacter {
	@Id
	private String id;
	private String name;
	private String playerName;
	private Demographics demographics;
    private StatBlock statBlock;
    private Proficiencies proficencies;
    private Gear gear;	
    private Survival survival;
    private ClassStats classStats;
	
    public PlayerCharacter(String id, String name, String playerName, Demographics demographics, StatBlock statBlock,
			Proficiencies proficencies, Gear gear, Survival survival, ClassStats classStats) {
		super();
		this.id = id;
		this.name = name;
		this.playerName = playerName;
		this.demographics = demographics;
		this.statBlock = statBlock;
		this.proficencies = proficencies;
		this.gear = gear;
		this.survival = survival;
		this.classStats = classStats;
	}
	public PlayerCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Demographics getDemographics() {
		return demographics;
	}
	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}
	public StatBlock getStatBlock() {
		return statBlock;
	}
	public void setStatBlock(StatBlock statBlock) {
		this.statBlock = statBlock;
	}
	public Proficiencies getProficencies() {
		return proficencies;
	}
	public void setProficencies(Proficiencies proficencies) {
		this.proficencies = proficencies;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	public Survival getSurvival() {
		return survival;
	}
	public void setSurvival(Survival survival) {
		this.survival = survival;
	}
	public ClassStats getClassStats() {
		return classStats;
	}
	public void setClassStats(ClassStats classStats) {
		this.classStats = classStats;
	}
	@Override
	public String toString() {
		return "PlayerCharacter [id=" + id + ", name=" + name + ", playerName=" + playerName + ", demographics="
				+ demographics + ", statBlock=" + statBlock + ", proficencies=" + proficencies + ", gear=" + gear
				+ ", survival=" + survival + ", classStats=" + classStats + "]";
	}
    
    
}
