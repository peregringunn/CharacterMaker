package net.characterGen.EquipmentMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weapon {
	@Id
	private String name;
	private float cost;
	private float weight;
	private String description;
	private String type;
	private String damage;
	private List<String> properties;
	public Weapon() {
		super();
	}
	public Weapon(String name, float cost, float weight, String description, String type, String damage,
			List<String> properties) {
		super();
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.description = description;
		this.type = type;
		this.damage = damage;
		this.properties = properties;
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
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public String getDamage() {
		return damage;
	}
	public List<String> getProperties() {
		return properties;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
}
