package ner;

import java.io.FileInputStream;
import java.io.InputStream;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class NameFinderSentences {

	public static void main(String[] args) throws Exception {
		String sentence = "Mike is senior programming manager and Smith is a clerk both are working at Tutorialspoint";
		InputStream inputStream = new FileInputStream("D:/Code_base/NLP/NLP Models/en-token.bin");
		TokenizerModel model = new TokenizerModel(inputStream);
		TokenizerME tokenizer = new TokenizerME(model);
		String[] tokens = tokenizer.tokenize(sentence);
		for(String str : tokens){
			System.out.println(str);
		}
		inputStream = new FileInputStream("D:/Code_base/NLP/NLP Models/en-ner-person.bin");
		TokenNameFinderModel nameModel = new TokenNameFinderModel(inputStream);
		NameFinderME finder = new NameFinderME(nameModel);
		Span [] spans = finder.find(tokens);
		for(Span span: spans){
			System.out.println(span.toString() +" "+ tokens[span.getStart()]);
		}
		inputStream.close();
	}
}
