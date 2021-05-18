package anagram;

public class Anagramm {

    public static String getAnagramm(String inputText) {
        StringBuilder outputText = new StringBuilder();
        String[] words = inputText.split(" ");
        for (String word : words) {
            outputText.append(revertWord(word)).append(" ");
        }
        return outputText.toString().trim();
    }

    private static String revertWord(String word) {
		char[] chars = insertNoneLetters(word);
		char character;
		for (int i = word.length() - 1, startIndex = 0; i >= 0; i--) {
			character = word.charAt(i);
			if (Character.isLetter(character)) {
				if (chars[startIndex] == '\u0000') {
					chars[startIndex] = character;
					startIndex++;
				} else {
					startIndex++;
					chars[startIndex] = character;
				}
			}
		}
		return new String(chars);
    }

    private static char[] insertNoneLetters(String word) {
        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                chars[i] = word.charAt(i);
            }
        }
        return chars;
    }
}
