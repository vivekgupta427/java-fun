package sentenceDetection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

public class SentencesAndPosDetection {

	public static void main(String[] args) {
		String sentence = "Hi, My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad. " + "This is third sentence. ";
		FileInputStream inputStream = null;
		SentenceModel sentModel = null;
		try {
			inputStream = new FileInputStream(
					"D:/Code_base/NLP/NLP Models/en-sent.bin");
			sentModel = new SentenceModel(inputStream);
		} catch (FileNotFoundException fe) {
			System.out.println("File not found :" + fe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SentenceDetectorME detector = new SentenceDetectorME(sentModel);
		Span[] spans = detector.sentPosDetect(sentence);
		for (Span span : spans) {
			System.out.println(sentence.substring(span.getStart(),
					span.getEnd())
					+ " " + span);
		}
	}

}
