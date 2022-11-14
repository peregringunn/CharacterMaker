package net.characterGen.EquipmentMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Armor {
	@Id
	private String name;
	private float cost;
	private float weight;
	private String description;
	private String type;
	private int bonus;
	private int maxDex;
	private int minStr;
	private boolean stealthDisadvantage;
	private int magicBonus;
	public Armor(String name, float cost, float weight, String description, String type, int bonus, int maxDex,
			int minStr, boolean stealthDisadvantage, int magicBonus) {
		super();
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.description = description;
		this.type = type;
		this.bonus = bonus;
		this.maxDex = maxDex;
		this.minStr = minStr;
		this.stealthDisadvantage = stealthDisadvantage;
		this.magicBonus = magicBonus;
	}
	public String getName() {
		return name;
	}
	public float getCost() {
		return cost;
	}
	public float getWeight() {
		return weight;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Armor() {
		super();
	}
	public String getType() {
		return type;
	}
	public int getBonus() {
		return bonus;
	}
	public int getMaxDex() {
		return maxDex;
	}
	public int getMinStr() {
		return minStr;
	}
	public boolean isStealthDisadvantage() {
		return stealthDisadvantage;
	}
	public int getMagicBonus() {
		return magicBonus;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void setMaxDex(int maxDex) {
		this.maxDex = maxDex;
	}
	public void setMinStr(int minStr) {
		this.minStr = minStr;
	}
	public void setStealthDisadvantage(boolean stealthDisadvantage) {
		this.stealthDisadvantage = stealthDisadvantage;
	}
	public void setMagicBonus(int magicBonus) {
		this.magicBonus = magicBonus;
	}
	
}
