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
		Joueur joueur1=new Joueur("Joueur1");

		Chevalet chevaletMain;
		
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("---------- Développé par nous ----------");
		message(LIGNE_HORIZONTALE);
		
		arbitre.initierChevalet();
		chevaletMain = joueur1.getjChevalet();
		//System.out.println(chevaletMain);


        
        arbitre.echanger(chevaletMain);

		
		//plateau.afficherPlateau();
        
	}
	
}