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
        char[] input = "a1bcd efg!h".toCharArray();
	    char[] output = new char[input.length];
	    int charIndex = 0;
	    char charachter;

        for (int i = input.length - 1; i >= 0; i--) {
            charachter = input[i];
            if (Character.isLetter(charachter)) {
            output[charIndex] = charachter;
            charIndex++;
            } else {
            output[i] = charachter;
            charIndex++;
            }
        }

	Arrays.asList(output).stream().forEach(c -> System.out.print(c));
    }

}
