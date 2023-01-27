package net.characterGen.characterCreation.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import net.characterGen.characterCreation.model.Ally;
import net.characterGen.characterCreation.model.Attack;
import net.characterGen.characterCreation.model.PlayerCharacter;
import net.characterGen.characterCreation.model.Race;

@Service
public class CreationService {
	
	private final RestTemplate restTemplate;
	private final String gatewayUri;
	

	public CreationService(RestTemplateBuilder restTemplateBuilder) {
		super();
		this.restTemplate = restTemplateBuilder.build();
		this.gatewayUri = System.getenv("GATEWAY_URI");
	}

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
    	String uri =  gatewayUri + "/class/names";
		return getList(uri);
    }

	public Object getRaceList() {
		String uri = gatewayUri + "/race/names";
		return getList(uri);
	}

	public Object getBackgroundList() {
		String uri = gatewayUri + "/background/names";
		
		return getList(uri);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<String> getList(String uri) {
		List<String> list = new ArrayList();
		ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        try {
        	list = mapper.readValue(result.getBody(), List.class);
        }catch (Exception e){
        	e.printStackTrace();
        }
		return list;
	}

	public void addCharacter(PlayerCharacter playerCharacter) {
		String uri = gatewayUri + "/character/";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectWriter objectWriter = new ObjectMapper().writer();
		String jsonString;
		try {
			jsonString = "[" + objectWriter.writeValueAsString(playerCharacter) + "]";
			HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
			ResponseEntity<String> response = this.restTemplate.postForEntity(uri, entity, String.class);
			System.out.println(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public List<String> getSubraceList(String raceName) {
		Race race = getRace(raceName);
		return race.getSubraces();
	}

	private Race getRace(String raceName) {
		ObjectMapper mapper = new ObjectMapper();
        String uri = gatewayUri + "/race/" + raceName;
		ResponseEntity<String> result = restTemplate.getForEntity(uri , String.class);
        try {
        	Race race = mapper.readValue(result.getBody(), Race.class);
        	return race;
        }catch (Exception e){
        	e.printStackTrace();
        }
		return null;
	}
	

}
