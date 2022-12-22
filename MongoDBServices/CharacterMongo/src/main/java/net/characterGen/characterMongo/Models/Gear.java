package net.characterGen.characterMongo.Models;

import java.util.List;

import lombok.Data;

@Data
public class Gear {
	private List<Attack> attacks;
	private List<String> equipment;
	private Money money;
}
