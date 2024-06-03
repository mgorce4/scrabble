package scrabble.application;

import java.util.List;

import scrabble.arbitreDuJeu.Arbitre;
import scrabble.materiel.*;

public class ScrabbleApplicationConsole {
	
	private static final String LIGNE_HORIZONTALE = "-------------------------------------------------------";

	public static void message(String texte) {
		System.out.println(texte);
	}

	public static void main(String[] args) {
		Arbitre arbitre=new Arbitre();
		Plateau plateau= new Plateau();

		Chevalet chevaletMain = new Chevalet();
		
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("---------- Développé par nous ----------");
		message(LIGNE_HORIZONTALE);
		
		
		chevaletMain=arbitre.initierChevalet();
		
		List<Jeton> listejetons = chevaletMain.recupChevaletliste();

        message("Voici le chevalet rempli :");
        for (Jeton jeton : listejetons) {
            message(jeton.toString());    
        }
        
        arbitre.echanger(chevaletMain);
        listejetons = chevaletMain.recupChevaletliste();

        chevaletMain.afficher();
        
		
		//plateau.afficherPlateau();
        
	}
	
}