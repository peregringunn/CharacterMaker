package net.characterGen.characterMongo.Models;

public class Money {
	private int copper;
	private int silver;
	private int electrum;
	private int gold;
	private int platinum;
	
	public Money(int copper, int silver, int electrum, int gold, int platinum) {
		super();
		this.copper = copper;
		this.silver = silver;
		this.electrum = electrum;
		this.gold = gold;
		this.platinum = platinum;
	}
	public Money() {
		super();
		copper = 0;
		silver = 0;
		electrum = 0;
		gold = 0;
		platinum = 0;
	}
	public int getCopper() {
		return copper;
	}
	public void setCopper(int copper) {
		this.copper = copper;
	}
	public int getSilver() {
		return silver;
	}
	public void setSilver(int silver) {
		this.silver = silver;
	}
	public int getElectrum() {
		return electrum;
	}
	public void setElectrum(int electrum) {
		this.electrum = electrum;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getPlatinum() {
		return platinum;
	}
	public void setPlatinum(int platinum) {
		this.platinum = platinum;
	}
	@Override
	public String toString() {
		return "Money [copper=" + copper + ", silver=" + silver + ", electrum=" + electrum + ", gold=" + gold
				+ ", platinum=" + platinum + "]";
	}
	
	
}