package scrabble.application;

import java.util.List;

import scrabble.matériel.Chevalet;
import scrabble.matériel.Jeton;

public class ScrabbleApplicationConsole {
	
	
	private static Chevalet chevalet = new Chevalet();
	
	private static final String LIGNE_HORIZONTALE = "-------------------------------------------------------";

	public static void message(String texte) {
		System.out.println(texte);
	}

	public static void main(String[] args) {
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("-- Développé par nous --");
		message("--testtt--");
		message(LIGNE_HORIZONTALE);
		
		List<Jeton> listejetons = chevalet.retourliste();


        message("Voici le chevalet rempli :");
        for (Jeton jeton : listejetons) {
            message(jeton.toString());
        }

		}
}