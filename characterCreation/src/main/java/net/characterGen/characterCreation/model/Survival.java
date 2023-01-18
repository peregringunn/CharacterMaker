package net.characterGen.characterCreation.model;

import lombok.Data;

@Data
public class Survival {
	private int armorClass;
	private int hitPointMax;
	private int currentHitPoints;
	private int temporaryHitPoints;
}
