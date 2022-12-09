package net.characterGen.spellMongo.Models;

public class Attack {
	private String name;
	private int attackBonus;
	private String damage;
	private String type;
	public Attack(String name, int attackBonus, String damage, String type) {
		super();
		this.name = name;
		this.attackBonus = attackBonus;
		this.damage = damage;
		this.type = type;
	}
	public Attack() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttackBonus() {
		return attackBonus;
	}
	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Attack [name=" + name + ", attackBonus=" + attackBonus + ", damage=" + damage + ", type=" + type + "]";
	}
	
	
}
