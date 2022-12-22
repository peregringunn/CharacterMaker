package net.characterGen.characterMongo.Models;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ClassStats {
    private List<Map<String,Integer>> characterClasses;
	private List<String> subclass;
	private List<String> spellsKnown;
	private int experience;
}
