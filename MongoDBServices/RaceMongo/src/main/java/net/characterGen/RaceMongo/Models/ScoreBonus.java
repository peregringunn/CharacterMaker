package net.characterGen.RaceMongo.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ScoreBonus {
	private String scoreName;
	private int bonus;
}
