package scrabble.application;

import java.util.List;

import scrabble.arbitreDuJeu.Arbitre;
import scrabble.matériel.Chevalet;
import scrabble.matériel.Jeton;

public class ScrabbleApplicationConsole {
	
	private static final String LIGNE_HORIZONTALE = "-------------------------------------------------------";

	public static void message(String texte) {
		System.out.println(texte);
	}

	public static void main(String[] args) {
		Chevalet chevaletMain = new Chevalet();
		Arbitre arbitre=new Arbitre();
		
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("---------- Développé par nous ----------");
		message(LIGNE_HORIZONTALE);
		
		
		chevaletMain.recupChevaletliste();
		
		List<Jeton> listejetons = chevaletMain.recupChevaletliste();

        message("Voici le chevalet rempli :");
        for (Jeton jeton : listejetons) {
            message(jeton.toString());    
        }
        
        arbitre.echanger(chevaletMain);
        listejetons = chevaletMain.recupChevaletliste();

        message("Voici le chevalet rempli :");
        for (Jeton jeton : listejetons) {
            message(jeton.toString());    
        }
        
		System.out.println(arbitre.piocher());
        
	}
	
}