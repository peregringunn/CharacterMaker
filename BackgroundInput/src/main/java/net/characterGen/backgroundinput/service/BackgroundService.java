package net.characterGen.backgroundinput.service;


import java.util.Arrays;
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

import net.characterGen.backgroundinput.models.Background;
import net.characterGen.backgroundinput.models.Charateristics;
import net.characterGen.backgroundinput.models.FormBackground;

@Service
public class BackgroundService {
	
	private final RestTemplate restTemplate;
	
	

	public BackgroundService(RestTemplateBuilder restTemplateBuilder) {
		super();
		this.restTemplate = restTemplateBuilder.build();
	}

	public void background(FormBackground background) {
		final ObjectMapper mapper = new ObjectMapper();
		Background bg = new Background();
		try {
			bg.setName(background.getName());
			bg.setProficiencies(Arrays.asList(mapper.readValue(background.getProficiencies(), String[].class)));
			bg.setLanguages(Arrays.asList(mapper.readValue(background.getLanguages(), String[].class)));
			bg.setEquipment(Arrays.asList(mapper.readValue(background.getEquipment(), String[].class)));
			bg.setFeature(background.getFeature());
			bg.setCharacteristics(Arrays.asList(mapper.readValue(background.getCharacteristics(), Charateristics[].class)));
			this.addBackground(bg);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

	private void addBackground(Background bg) {
		String url = System.getenv("GATEWAY_URI") + "/background/";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectWriter objectWriter = new ObjectMapper().writer();
		String jsonString;
		try {
			jsonString = "[" + objectWriter.writeValueAsString(bg) + "]";
			HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
			ResponseEntity<String> response = this.restTemplate.postForEntity(url, entity, String.class);
			System.out.println(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
