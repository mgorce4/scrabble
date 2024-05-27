package scrabble.arbitreDuJeu;

import java.io.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import scrabble.matériel.*;


public class Arbitre {
	private Sac sacPourArbitre = new Sac();
	private Chevalet chevaletArbitre;
	public Sac RecupeSac() {
		return sacPourArbitre;
	}
	
	public List<Jeton> recupListe() {
		//permet de recuperer la list<Jeton> de l'attribut sacPourArbitre
        return new ArrayList<>(sacPourArbitre.recupSacRempli());
    }
	
	public Jeton piocher() {
        sacPourArbitre.sac();
        sacPourArbitre.mélanger();
		List<Jeton> ListeEstRecup=recupListe();
		Jeton jetonRecup =sacPourArbitre.donnerSac(ListeEstRecup);
        return jetonRecup;
    }
	
	public Jeton échanger(Chevalet chevalet) {
		chevaletArbitre=chevalet;
		chevaletArbitre.recupChevaletliste();
		
		//On demande le jeton que le joueur veut echanger
		System.out.println("choisissez le jeton à échanger");
		Scanner scanner = new Scanner(System.in);
		int jetonchoisi = scanner.nextInt();
		//TODO une exception si on choisit un nombre <=0
		
		
		Jeton jetonEchange = chevaletArbitre.donnerJeton(jetonchoisi);
		sacPourArbitre.recevoir(jetonEchange);
        sacPourArbitre.mélanger();
        Jeton nouveauxJeton=piocher();
		
		return nouveauxJeton;
        
    }

}
