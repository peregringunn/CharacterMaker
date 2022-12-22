package net.characterGen.CharacterInput.models;

import lombok.Data;

@Data
public class PlayerCharacter {
	private String name;
	private String playerName;
	private Demographics demographics;
    private StatBlock statBlock;
    private Proficiencies proficiencies;
    private Gear gear;	
    private Survival survival;
    private ClassStats classStats;
}
