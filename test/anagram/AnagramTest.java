/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Andrii Hromov
 */
public class AnagramTest {

    public AnagramTest() {
    }

    @Test
    public void getAnagrammTest() {
	String input = "a1bcd efg!h";
	String expResult = "d1cba hgf!e";
	String result = Anagramm.getAnagramm(input);
	assertEquals(expResult, result);
    }

}
