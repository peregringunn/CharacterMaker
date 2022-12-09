package net.characterGen.characterMongo.Models;

public class Survival {
	private int armorClass;
	private int hitPointMax;
	private int currentHitPoints;
	private int temporaryHitPoints;
	public Survival(int armorClass, int hitPointMax, int currentHitPoints, int temporaryHitPoints) {
		super();
		this.armorClass = armorClass;
		this.hitPointMax = hitPointMax;
		this.currentHitPoints = currentHitPoints;
		this.temporaryHitPoints = temporaryHitPoints;
	}
	public Survival() {
		super();
	}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	public int getHitPointMax() {
		return hitPointMax;
	}
	public void setHitPointMax(int hitPointMax) {
		this.hitPointMax = hitPointMax;
	}
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}
	public int getTemporaryHitPoints() {
		return temporaryHitPoints;
	}
	public void setTemporaryHitPoints(int temporaryHitPoints) {
		this.temporaryHitPoints = temporaryHitPoints;
	}
	@Override
	public String toString() {
		return "Survival [armorClass=" + armorClass + ", hitPointMax=" + hitPointMax + ", currentHitPoints="
				+ currentHitPoints + ", temporaryHitPoints=" + temporaryHitPoints + "]";
	}
	
}
