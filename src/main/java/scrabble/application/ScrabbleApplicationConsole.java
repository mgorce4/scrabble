package scrabble.application;

public class ScrabbleApplicationConsole {
	
	public static final String LIGNE_HORIZONTALE = "-------------------------------------------------------";

	public static void message(String texte) {
		System.out.println(texte);
	}

	public static void main(String[] args) {
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("-- Développé par nous --");
		message("--testtt--");
		message(LIGNE_HORIZONTALE);
		}
}