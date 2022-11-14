package net.characterGen.BackgroundMongo.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Charateristics extends Feature{
	private String type;

	public Charateristics() {
		super();
	}

	public Charateristics(String id,String name, String description, String type) {
		super(id, name, description);
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
