package ner;

import java.io.FileInputStream;

import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class TokenizerMEProbs {

	public static void main(String[] args) throws Exception {
		String sentence = "Ramesh works in Oracle in India UnitedStates Australia";
		FileInputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-token.bin");
		TokenizerModel model = new TokenizerModel(inputStream);
		TokenizerME tokenizer = new TokenizerME(model);
		Span[] tokens = tokenizer.tokenizePos(sentence);
		double[] probs = tokenizer.getTokenProbabilities();

		for (Span span : tokens) {
			System.out.println(span + " "
					+ sentence.substring(span.getStart(), span.getEnd()));
		}
		System.out.println(" ");
		for (double prob : probs) {
			System.out.println(prob);
		}
		
		inputStream.close();
	}
}
