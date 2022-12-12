package net.characterGen.backgroundinput.models;


public class Equipment {
	private String name;
	private float cost;
	private float weight;
	private String description;
	public Equipment(String name, float cost, float weight, String description) {
		super();
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.description = description;
	}
	public Equipment() {
		super();
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
}
