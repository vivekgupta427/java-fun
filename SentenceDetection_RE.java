package sentenceDetection;

public class SentenceDetection_RE {
	public static void main(String[] args) {
		String sentence = "Hi. My name is Vivek Gupta! How are you ?"
				+ "I work for Oracle Hyderabad.";
		String regExp = "[.?!]";
		String[] splitString = sentence.split(regExp);
		for (String str : splitString) {
			System.out.println(str);
		}
	}
}
