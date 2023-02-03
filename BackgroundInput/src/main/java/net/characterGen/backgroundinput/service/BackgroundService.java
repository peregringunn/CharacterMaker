package net.characterGen.backgroundinput.service;


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

import net.characterGen.backgroundinput.models.Background;

@Service
public class BackgroundService {
	
	private final RestTemplate restTemplate;
	
	

	public BackgroundService(RestTemplateBuilder restTemplateBuilder) {
		super();
		this.restTemplate = restTemplateBuilder.build();
	}

	public void addBackground(Background bg) {
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

	public List<String> intializeList() {
		List<String> list = new ArrayList<>();
		list.add("");
		return list;
	}

}
