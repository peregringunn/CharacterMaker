package net.characterGen.CharacterInput.models;

import java.util.List;

import lombok.Data;

@Data
public class Gear {
	private List<Attack> attacks;
	private List<String> equipment;
	private Money money;
}
