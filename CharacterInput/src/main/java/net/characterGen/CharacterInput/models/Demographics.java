package net.characterGen.CharacterInput.models;

import java.util.List;
import lombok.Data;

@Data
public class Demographics {
	private String background;
	private String race;
	private String subrace;
	private String alignment;
	private int age;
	private String height;
	private String weight;
	private String eyes;
	private String skin;
	private String hair;
	private String appearence;
	private String backstory;
	private List<Ally> alliesAndOrganizations;
}
