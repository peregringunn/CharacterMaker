package net.characterGen.classSpellListMongo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ClassSpellList {
	@Id
	private String className;
	private List<String> cantrips;
	private List<String> first;
	private List<String> second;
	private List<String> third;
	private List<String> fourth;
	private List<String> fith;
	private List<String> sixth;
	private List<String> seventh;
	private List<String> eighth;
	private List<String> ninth;
}
