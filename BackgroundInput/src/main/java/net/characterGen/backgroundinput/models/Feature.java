package net.characterGen.backgroundinput.models;


public class Feature {
	private String name;
	private String description;
	
	public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Feature() {
		super();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
