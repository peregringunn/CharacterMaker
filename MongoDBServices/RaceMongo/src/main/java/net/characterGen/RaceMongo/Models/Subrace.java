package net.characterGen.RaceMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Subrace {
	@Id
	private String name;
	private String parentRace;
	private List<ScoreBonus> scoreBonuses;
	private List<Feature> traits;
}
