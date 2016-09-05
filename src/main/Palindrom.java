package de.swe;

/**
 * Mit Palindrom kann ein char-Feld daraufhin überprüft werden,
 * ob es ein Palindrom ist oder nicht.
 * Ein Palindrom ist ein Wort, das Vorwärts und Rückwärts gelesen
 * gleich ist. Zum Beispiel "abba", "lagerregal".
 * 
 * 
 * @author pape
 *
 */
public class Palindrom {

	/**
	 * Gibt genau dann <code>true</code> zurück, wenn
	 * <code>wort</code> ein Palindrom ist.
	 * Gross-/Kleinschreibung wird dabei nicht unterschieden.
	 */
	public boolean isPalindrom(char [] wort) {
		return isPalindrom(wort, 0, wort.length - 1);
	}

	/**
	 * Rekursive Implementierung für die Palindromüberprüfung.
	 */
	private boolean isPalindrom(char[] wort, int start, int ende) {
		if (start >= ende) {
			return true;
		} else {
			return wort[start] == wort[ende]
			         && isPalindrom(wort, start + 1, ende - 1);
		}
	}
}
