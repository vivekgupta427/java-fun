package sentenceDetection;

import java.io.FileInputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

public class SentenceDetectionMEProbs {

	public static void main(String[] args) {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence. ";
		FileInputStream inputStream = null;
		SentenceModel sentModel = null;
		try {
			inputStream = new FileInputStream(
					"D:/Code_base/NLP/NLP Models/en-sent.bin");
			sentModel = new SentenceModel(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SentenceDetectorME detector = new SentenceDetectorME(sentModel);
		String[] sents = detector.sentDetect(sentence);
		for (String str : sents) {
			System.out.println(str);
		}

		System.out.println("  ###########  ");

		double[] probs = detector.getSentenceProbabilities();

		for (double prob : probs) {
			System.out.println(prob);
		}
	}
}
