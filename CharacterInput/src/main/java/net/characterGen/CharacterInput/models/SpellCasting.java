package net.characterGen.CharacterInput.models;

import java.util.List;

import lombok.Data;

@Data
public class SpellCasting {
	private String spellCastingClass;
	private int level;
	private String spellCatingAbillity;
	private List<String> cantripsKnown;
	private List<List<String>> spellsKnown;
	private List<Integer> spellsSlots;
	private int spellSaveDc;
	private int spellAttackBonus;
}
