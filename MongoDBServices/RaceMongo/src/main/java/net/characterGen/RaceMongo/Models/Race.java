package net.characterGen.RaceMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Race {
	@Id
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
}
