package sentenceDetection;

import java.io.FileInputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

public class SentenceDetectionNLP {
	public static void main(String[] args) throws Exception {
		String sentence = "Hi. My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad.";
		FileInputStream fileInputStream = new FileInputStream(
				"D:/Code_base/NLP/NLP Models/en-sent.bin");
		SentenceModel sentModel = new SentenceModel(fileInputStream);
		SentenceDetectorME detector = new SentenceDetectorME(sentModel);
		String[] sents = detector.sentDetect(sentence);
		for (String sent : sents) {
			System.out.println(sent);
		}
	}
}
