package net.characterGen.models;

import java.util.List;

public class Gear {
	private List<Attack> attacks;
	private List<String> equipment;
	private Money money;
	public Gear(List<Attack> attacks, List<String> equipment, Money money) {
		super();
		this.attacks = attacks;
		this.equipment = equipment;
		this.money = money;
	}
	public Gear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Attack> getAttacks() {
		return attacks;
	}
	public void setAttacks(List<Attack> attacks) {
		this.attacks = attacks;
	}
	public List<String> getEquipment() {
		return equipment;
	}
	public void setEquipment(List<String> equipment) {
		this.equipment = equipment;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Gear [attacks=" + attacks + ", equipment=" + equipment + ", money=" + money + "]";
	}
	
}
