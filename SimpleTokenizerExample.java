package tokenize;

import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span;

public class SimpleTokenizerExample {

	public static void main(String[] args) {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence. ";
		SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
		//String[] tokens = tokenizer.tokenize(sentence);
		Span [] spans = tokenizer.tokenizePos(sentence);
		for (Span token : spans) {
			System.out.println(token +" "+ sentence.substring(token.getStart(), token.getEnd()));
		}
	}
}
