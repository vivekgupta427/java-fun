package pos;

import java.io.FileInputStream;

import opennlp.tools.cmdline.PerformanceMonitor;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class PartsOfSpeechTagger {

	public static void main(String[] args) throws Exception {
		String sentence = "Ramesh works in Oracle in India UnitedStates Australia"
				+ "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence.";
		FileInputStream inputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-pos-maxent.bin");
		POSModel model = new POSModel(inputStream);
		POSTaggerME tagger = new POSTaggerME(model);

		WhitespaceTokenizer tokenizer = WhitespaceTokenizer.INSTANCE;
		String[] tokens = tokenizer.tokenize(sentence);
		String[] tags = tagger.tag(tokens);
		POSSample sample = new POSSample(tokens, tags);

		System.out.println(sample.toString());

		double[] probs = tagger.probs();

		for (double prob : probs) {
			System.out.println(prob);
		}

		PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent");
		perfMon.startAndPrintThroughput();
		// perfMon.start();
		perfMon.incrementCounter();
		perfMon.stopAndPrintFinalResult();

	}
}
