package ner;

import java.io.FileInputStream;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class LocationFinder {

	public static void main(String[] args) throws Exception{
		String sentence = "Ramesh works in Oracle in India UnitedStates Australia";
		FileInputStream inputStreamTokens = new FileInputStream("D:/Code_base/NLP/NLP Models/en-token.bin");
		TokenizerModel tokenModel = new TokenizerModel(inputStreamTokens);
		TokenizerME tokenizer = new TokenizerME(tokenModel);
		String [] tokens = tokenizer.tokenize(sentence);
		for(String str : tokens){
			System.out.println(str);
		}
		
		FileInputStream inputStreamLocation = new FileInputStream("D:/Code_base/NLP/NLP Models/en-ner-location.bin");
		TokenNameFinderModel locationModel = new TokenNameFinderModel(inputStreamLocation);
		NameFinderME locationsFinder = new NameFinderME(locationModel);
		Span [] spans = locationsFinder.find(tokens);
		for (Span span : spans){
			System.out.println(span);
		}
		inputStreamTokens.close();
	}
}
