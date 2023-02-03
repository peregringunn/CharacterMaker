package net.characterGen.BackgroundMongo.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Feature {
	private String name;
	private String description;
	

}
