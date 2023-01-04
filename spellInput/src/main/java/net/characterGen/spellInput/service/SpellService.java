package net.characterGen.spellInput.service;

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

import net.characterGen.spellInput.models.Spell;

@Service
public class SpellService {

	private final RestTemplate restTemplate;

	public SpellService(RestTemplateBuilder builder) {
		super();
		this.restTemplate = builder.build();
	}

	public void addSpell(Spell spell) {
		String url = System.getenv("GATEWAY_URI") + "/spell/";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectWriter objectWriter = new ObjectMapper().writer();
		String jsonString;
		try {
			jsonString = "[" + objectWriter.writeValueAsString(spell) + "]";
			HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
			ResponseEntity<String> response = this.restTemplate.postForEntity(url, entity, String.class);
			System.out.println(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
