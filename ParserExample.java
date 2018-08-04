package pos;

import java.io.FileInputStream;

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.Parser;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;

public class ParserExample {

	public static void main(String[] args) throws Exception {
		String sentence = "Ramesh works in Oracle in India UnitedStates Australia"
				+ "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence.";
		FileInputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-parser-chunking.bin");
		ParserModel model = new ParserModel(inputStream);
		Parser parser = ParserFactory.create(model);
		Parse[] topParsers = ParserTool.parseLine(sentence, parser, 1);
		for (Parse parse : topParsers) {
			parse.show();
		}
	}
}
