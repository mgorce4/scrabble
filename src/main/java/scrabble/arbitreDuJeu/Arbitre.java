package scrabble.arbitreDuJeu;

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
	
	public Chevalet echanger(Chevalet chevalet) {
		Jeton nouveauxJeton= null;
		chevaletArbitre=chevalet;
		chevaletArbitre.recupChevaletliste();
		
		try {
			//On demande le jeton que le joueur veut echanger
			System.out.println("choisissez le jeton à échanger");
			Scanner scanner = new Scanner(System.in);
			int jetonchoisi = scanner.nextInt();
			
			Jeton jetonEchange = chevaletArbitre.chevaltDonne(jetonchoisi);
			sacPourArbitre.sacRecevoir(jetonEchange);
			nouveauxJeton=piocher();
			chevaletArbitre.chevaletRecup(nouveauxJeton);
			sacPourArbitre.mélanger();
			
		} catch (Exception e) {
			System.out.println("Erreur, Jeton inexistant.");
			//return null;
		}
		
		
		return chevaletArbitre;
        
    }

}
