package de.hska.java.aufgaben.rekursion;

/**
 * Mit Palindrom kann ein char-Feld daraufhin überprüft werden,
 * ob es ein Palindrom ist oder nicht.
 * Ein Palindrom ist ein Wort, das Vorwärts und Rückwärts gelesen
 * gleich ist. Zum Beispiel "abba", "lagerregal".
 * <p>
 *   <a href="http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/rekursion.html#palindrom">Zurück zum Aufgabentext</a>
 * </p>
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
