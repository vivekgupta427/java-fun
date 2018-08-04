package tokenize;

import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.Span;

public class WhitespaceTokenizerExample {

	public static void main(String[] args) {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence. ";
		WhitespaceTokenizer tokenizer = WhitespaceTokenizer.INSTANCE;
		Span[] tokens = tokenizer.tokenizePos(sentence);
		for (Span token : tokens) {
			System.out.println(token + "  "
					+ sentence.substring(token.getStart(), token.getEnd()));
		}
	}
}
