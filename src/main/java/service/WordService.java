package service;
import org.springframework.stereotype.Service;

import Repository.WordRepository;
import model.Word;

@Service
public class WordService {
	public Word processWord(Word model) {
		model.setAnagramOfPalindrome(WordRepository.isAnagramPalindrome(model.getWord()));
		model.setPalindrome(WordRepository.findPalindrome(model.getWord()));
		return model;
	}	
}

