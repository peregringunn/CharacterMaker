package net.characterGen.characterCreation.model;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Gear {
	private List<Attack> attacks;
	private List<String> equipment;
	private Money money;
	public Gear() {
		super();
		this.attacks = new ArrayList<>();
		this.equipment = new ArrayList<>();
		this.money = new Money();
	}
	public Gear(List<Attack> attacks, List<String> equipment, Money money) {
		super();
		this.attacks = attacks;
		this.equipment = equipment;
		this.money = money;
	}
	
	
}
