package net.characterGen.characterClassInput.service;

import org.springframework.stereotype.Service;

import net.characterGen.characterClassInput.models.CharacterClass;

@Service
public class CharacterClassService {

	public void addCharacterClass(CharacterClass characterClass) {
		// TODO Auto-generated method stub
		System.out.println(characterClass.toString());
	}

}
