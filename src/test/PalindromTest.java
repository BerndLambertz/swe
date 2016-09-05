package de.hska.java.aufgaben.rekursion;

import junit.framework.TestCase;

/**
 * JUnit-Testklasse für Palindrom.
 * 
 * @author pape
 */
public class PalindromTest extends TestCase {

	private Palindrom palindrom = new Palindrom();
	
	/*
	 * Test method for 'de.hska.info1.aufgaben.rekursion.Palindrom.isPalindrom(char[])'
	 */
	public void testIsPalindrom() {
		assertTrue(palindrom.isPalindrom("abba".toCharArray()));
	}

	public void testIsPalindrom1() {
		assertTrue(palindrom.isPalindrom("aba".toCharArray()));
	}
	
	public void testIsPalindrom2() {
		assertFalse(palindrom.isPalindrom("abc".toCharArray()));
	}
	
	public void testIsPalindrom3() {
		assertTrue(palindrom.isPalindrom("lagerregal".toCharArray()));
	}
	
}
