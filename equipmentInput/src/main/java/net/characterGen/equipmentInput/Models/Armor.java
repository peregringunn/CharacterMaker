package net.characterGen.equipmentInput.Models;

import lombok.Data;

@Data
public class Armor {
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
}
