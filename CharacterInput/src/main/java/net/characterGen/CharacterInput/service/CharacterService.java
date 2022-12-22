package net.characterGen.CharacterInput.service;

import org.springframework.stereotype.Service;

import net.characterGen.CharacterInput.models.PlayerCharacter;

@Service
public class CharacterService {

	public void addCharacter(PlayerCharacter playerCharacter) {
		System.out.println(playerCharacter);
		
	}

}
