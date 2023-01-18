package net.characterGen.characterCreation.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.characterGen.characterCreation.model.Ally;
import net.characterGen.characterCreation.model.Attack;
import net.characterGen.characterCreation.model.PlayerCharacter;

@Service
public class CreationService {

	public PlayerCharacter initialize(PlayerCharacter pc) {
		pc.setAlliesAndOrganizations(new ArrayList<>());
		pc.setSaveProficiencies(new ArrayList<>());
		pc.setSkillProficiencies(new ArrayList<>());
		pc.setToolProficiencies(new ArrayList<>());
		pc.setLanguages(new ArrayList<>());
		pc.setAttacks(new ArrayList<>());
		pc.setEquipment(new ArrayList<>());
		pc.setClassName(new ArrayList<>());
		pc.setLevel(new ArrayList<>());
		pc.setSubClass(new ArrayList<>());
		pc.setSpellsKnown(new ArrayList<>());
		
		pc.getAlliesAndOrganizations().add(new Ally());
		pc.getSaveProficiencies().add(" ");
		pc.getSkillProficiencies().add(" ");
		pc.getToolProficiencies().add(" ");
		pc.getLanguages().add(" ");
		pc.getAttacks().add(new Attack());
		pc.getEquipment().add(" ");
		pc.getClassName().add("place holder");
		pc.getLevel().add(0);
		pc.getSubClass().add(" ");
		pc.getSpellsKnown().add(" ");
		return pc;
	}

    public List<String> getClassList() {
    	
//    	RestTemplate restTemplate = new RestTemplate();
//    	String uri = "http://localhost:8080/class/names";
    	
        List<String> classList = new ArrayList<>();
        classList.add("Fighter");
        classList.add("Rouge");
        classList.add("Wizard");
        return classList;
    }

	public Object getRaceList() {
		List<String> raceList = new ArrayList<>();
		raceList.add("Elf");
		raceList.add("Human");
		raceList.add("Dwarf");
		return raceList;
	}

	public Object getBackgroundList() {
		String uri = "http://localhost:8080/background/names";
		
		return getList(uri);
	}

	private List<String> getList(String uri) {
		
		List<String> list = new ArrayList();
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<?> result =
                restTemplate.exchange(uri, HttpMethod.GET, entity, Class.class);
        System.out.println(result.getBody());
		return null;
	}

}
