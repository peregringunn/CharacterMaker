package net.characterGen.characterClassInput.service;

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

import net.characterGen.characterClassInput.models.Archetype;
import net.characterGen.characterClassInput.models.CharacterClass;
import net.characterGen.characterClassInput.models.ClassFeature;

@Service
public class CharacterClassService {

	private final RestTemplate restTemplate;
	
	
	
	public CharacterClassService(RestTemplateBuilder restTemplateBuilder) {
		super();
		this.restTemplate = restTemplateBuilder.build();
	}



	public void addCharacterClass(CharacterClass characterClass) {
		String url = System.getenv("GATEWAY_URI") + "/class/";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectWriter objectWriter = new ObjectMapper().writer();
		String jsonString;
		try {
			jsonString = "[" + objectWriter.writeValueAsString(characterClass) + "]";
			HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
			ResponseEntity<String> response = this.restTemplate.postForEntity(url, entity, String.class);
			System.out.println(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(characterClass.toString());
	}
	                         
	public List<String> intializeStringList() {
		List<String> list = new ArrayList<>();
		list.add("");
		return list;
	}



	public List<ClassFeature> intializeClassFeatureList() {
		List<ClassFeature> list = new ArrayList<>();
		list.add(new ClassFeature());
		return list;
	}



	public List<Archetype> intializeArchetypeList() {
		List<Archetype> list = new ArrayList<>();
		list.add(new Archetype());
		return list;
	}
}
