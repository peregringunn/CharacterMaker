package net.characterGen.EquipmentMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Equipment {
	@Id
	private String name;
	private float cost;
	private float weight;
	private String description;
}
