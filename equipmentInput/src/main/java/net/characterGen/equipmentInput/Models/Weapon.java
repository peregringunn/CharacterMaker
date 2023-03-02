package net.characterGen.equipmentInput.Models;

import java.util.List;

import lombok.Data;

@Data
public class Weapon {
	private String name;
	private float cost;
	private float weight;
	private String description;
	private String type;
	private String damage;
	private List<String> properties;
	
	public void addProperty(String string) {
		properties.add(string);
	}
	
	public void removePropertyAt(int index) {
		properties.remove(index);
	}
}
