package net.characterGen.characterMongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PlayerCharacter {
	@Id
	private String name;
	private String playerName;
	private Demographics demographics;
    private StatBlock statBlock;
    private Proficiencies proficiencies;
    private Gear gear;	
    private Survival survival;
    private ClassStats classStats;
}
