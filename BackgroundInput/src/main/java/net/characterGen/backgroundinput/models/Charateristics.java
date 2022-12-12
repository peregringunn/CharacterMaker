package net.characterGen.backgroundinput.models;




public class Charateristics extends Feature{
	private String type;

	public Charateristics() {
		super();
	}

	public Charateristics(String name, String description, String type) {
		super(name, description);
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
