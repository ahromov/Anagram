/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

/**
 *
 * @author Andrii Hromov
 */
public class Main {

    public static void main(String[] args) {
        String inputText = "a1bcd efg!h";

	StringBuilder outputText = new StringBuilder();

	String[] words = inputText.split(" ");
	for (String word : words) {
	    char[] outputWord = new char[word.length()];

	    for (int i = 0; i < word.length(); i++) {
		if (!Character.isLetter(word.charAt(i))) {
		    outputWord[i] = word.charAt(i);
		}
	    }

	    char character;

	    for (int i = word.length() - 1, startIndex = 0; i >= 0; i--) {
		character = word.charAt(i);
		if (Character.isLetter(character)) {
		    if (outputWord[startIndex] == '\u0000') {
			outputWord[startIndex] = character;
		    } else {
			startIndex++;
			outputWord[startIndex] = character;
		    }
		    startIndex++;
		}
	    }

	    outputText.append(new String(outputWord)).append(" ");
	}

	System.out.println(outputText.toString());
    }

}
