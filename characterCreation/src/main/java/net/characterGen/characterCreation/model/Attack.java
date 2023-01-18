package net.characterGen.characterCreation.model;

import lombok.Data;

@Data
public class Attack {
	private String name;
	private int attackBonus;
	private String damage;
	private String type;
}
