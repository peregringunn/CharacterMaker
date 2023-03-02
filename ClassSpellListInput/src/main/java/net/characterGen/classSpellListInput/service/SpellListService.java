package net.characterGen.classSpellListInput.service;

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

import net.characterGen.classSpellListInput.models.ClassSpellList;

@Service
public class SpellListService {

	private final RestTemplate restTemplate;
	
	
	
	public SpellListService(RestTemplateBuilder builder) {
		super();
		this.restTemplate = builder.build();
	}



	public void addSpellList(ClassSpellList spellList) {
//		System.out.println(spellList);
		String url = System.getenv("GATEWAY_URI") + "/spellList/";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectWriter objectWriter = new ObjectMapper().writer();
		String jsonString;
		try {
			jsonString = "[" + objectWriter.writeValueAsString(spellList) + "]";
			HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
			ResponseEntity<String> response = this.restTemplate.postForEntity(url, entity, String.class);
			System.out.println(response);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}



	public List<String> initializeStringList() {
		List<String> list = new ArrayList<>();
		list.add(new String());
		return list;
	}

}
