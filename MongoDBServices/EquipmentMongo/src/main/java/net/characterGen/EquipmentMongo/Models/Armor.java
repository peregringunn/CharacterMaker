package net.characterGen.EquipmentMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
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
}
