package tokenize;

import java.io.FileInputStream;

import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class TokenizerMEExample {

	public static void main(String[] args) throws Exception {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence. ";
		FileInputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-token.bin");
		TokenizerModel model = new TokenizerModel(inputStream);
		TokenizerME tokenizerME = new TokenizerME(model);
		Span[] tokens = tokenizerME.tokenizePos(sentence);
		for (Span str : tokens) {
			System.out.println(str + " "
					+ sentence.substring(str.getStart(), str.getEnd()));
		}
	}
}
