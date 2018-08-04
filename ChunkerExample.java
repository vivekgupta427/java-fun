package chunker;

import java.io.File;
import java.io.FileInputStream;

import opennlp.tools.chunker.ChunkerME;
import opennlp.tools.chunker.ChunkerModel;
import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.Span;

public class ChunkerExample {

	public static void main(String[] args) throws Exception {
		String sentence = "Ramesh works in Oracle in India UnitedStates Australia";
		WhitespaceTokenizer tokenizer = WhitespaceTokenizer.INSTANCE;
		String[] tokens = tokenizer.tokenize(sentence);
		for (String token : tokens) {
			System.out.print(token + " ");
		}

		System.out.println();
		File file = new File("D:/Code_base/NLP/NLP Models/en-pos-maxent.bin");
		POSModel model = new POSModelLoader().load(file);
		POSTaggerME tagger = new POSTaggerME(model);
		String[] tags = tagger.tag(tokens);
		for (String tag : tags) {
			System.out.print(tag + " ");
		}

		FileInputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-chunker.bin");
		ChunkerModel chunkerModel = new ChunkerModel(inputStream);
		ChunkerME chunker = new ChunkerME(chunkerModel);
		String[] results = chunker.chunk(tokens, tags);
		Span[] spans = chunker.chunkAsSpans(tokens, tags);
		double[] probs = chunker.probs();
		System.out.println();
		for (String result : results) {
			System.out.println(result);
		}

		System.out.println();
		for (Span span : spans) {
			System.out.println(span.toString());
		}
		System.out.println();
		for (double prob : probs) {
			System.out.println(prob);
		}
	}

}
