package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Word;
import service.WordService;



@RestController
@RequestMapping("/word")
public class WordController {


	@Autowired
	WordService wordService;
	
	Word wordModel = new Word();

	@RequestMapping("{word}")
	public Word getPerson(@PathVariable("word") String word) {
		wordModel.setWord(word);
		return wordService.processWord(wordModel);
	}

	
	
	
	
	
	
}
