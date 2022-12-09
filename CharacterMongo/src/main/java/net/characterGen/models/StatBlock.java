package net.characterGen.models;

public class StatBlock {
	
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	public StatBlock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StatBlock(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		super();
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	@Override
	public String toString() {
		return "StatBlock [strength=" + strength + ", dexterity=" + dexterity + ", constitution=" + constitution
				+ ", intelligence=" + intelligence + ", wisdom=" + wisdom + ", charisma=" + charisma + "]";
	}
	
}
