package ner;

import java.io.FileInputStream;
import java.io.InputStream;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.util.Span;

public class NameFinderMEExample {

	public static void main(String[] args) throws Exception {
		String[] sentence = new String[] { "Mike", "and", "John", "are",
				"for", "each", "other" };
		InputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/nl-ner-person.bin");
		TokenNameFinderModel model = new TokenNameFinderModel(inputStream);
		NameFinderME finder = new NameFinderME(model);
		Span[] spans = finder.find(sentence);
		System.out.println(spans.toString() + spans.length);
		for (Span span : spans) {
			System.out.println(span.toString() + " "+sentence[span.getStart()] +" "+sentence[span.getEnd()]);
		}

	}

}
