package sentenceDetection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

public class SentencDetectionNLPPos {

	public static void main(String[] args) {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. "+
				"This is third sentence. ";
		FileInputStream inputStream = null;
		SentenceModel sentDetect = null;
		try {
			inputStream = new FileInputStream(
					"D:/Code_base/NLP/NLP Models/en-sent.bin");
			sentDetect = new SentenceModel(inputStream);
		} catch (FileNotFoundException fe) {
			System.out.println("File not found exception found"
					+ fe.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		SentenceDetectorME detector = new SentenceDetectorME(sentDetect);
		Span[] strPos = detector.sentPosDetect(sentence);
		for (Span span : strPos) {
			System.out.println(span);
		}
	}
}
