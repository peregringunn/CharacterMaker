package net.characterGen.EquipmentMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
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
}
