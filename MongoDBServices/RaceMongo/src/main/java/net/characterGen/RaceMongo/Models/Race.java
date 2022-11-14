package net.characterGen.RaceMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Race {
	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String id;
	private String name;
	private String age;
	private String alignment;
	private String size;
	private String sizeDescription;
	private int speed;
	private List<ScoreBonus> scorebonuses;
	private List<String> proficiencies;
	private List<Feature> traits;
	private List<Subrace> subraces;
	public Race(String id, String name, String age, String alignment, String size, String sizeDescription, int speed,
			List<ScoreBonus> scorebonuses, List<String> proficiencies, List<Feature> traits, List<Subrace> subraces) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.alignment = alignment;
		this.size = size;
		this.sizeDescription = sizeDescription;
		this.speed = speed;
		this.scorebonuses = scorebonuses;
		this.proficiencies = proficiencies;
		this.traits = traits;
		this.subraces = subraces;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setSizeDescription(String sizeDescription) {
		this.sizeDescription = sizeDescription;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setScorebonuses(List<ScoreBonus> scorebonuses) {
		this.scorebonuses = scorebonuses;
	}
	public void setProficiencies(List<String> proficiencies) {
		this.proficiencies = proficiencies;
	}
	public void setTraits(List<Feature> traits) {
		this.traits = traits;
	}
	public void setSubraces(List<Subrace> subraces) {
		this.subraces = subraces;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getAlignment() {
		return alignment;
	}
	public String getSize() {
		return size;
	}
	public String getSizeDescription() {
		return sizeDescription;
	}
	public int getSpeed() {
		return speed;
	}
	public List<ScoreBonus> getScorebonuses() {
		return scorebonuses;
	}
	public List<String> getProficiencies() {
		return proficiencies;
	}
	public List<Feature> getTraits() {
		return traits;
	}
	public List<Subrace> getSubraces() {
		return subraces;
	}
}
