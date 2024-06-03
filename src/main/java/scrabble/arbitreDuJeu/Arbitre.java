package scrabble.arbitreDuJeu;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import scrabble.materiel.*;


public class Arbitre {
	private Sac sacPourArbitre = new Sac();
	private Chevalet chevaletArbitre;
	
	
	public List<Jeton> recupListe() {
		//permet de recuperer la list<Jeton> de l'attribut sacPourArbitre
        return new ArrayList<>(sacPourArbitre.recupSacRempli());
    }
	
	public Jeton piocher() {
        //sacPourArbitre.sac();
        sacPourArbitre.mélanger();
		List<Jeton> listeEstRecup=recupListe();
		Jeton jetonRecup =sacPourArbitre.donnerSac(listeEstRecup);
        return jetonRecup;
    }
	
	public Chevalet initierChevalet(){
		List<Jeton> jetons=null;
		 for (int i = 0; i < 7; i++) {
			 jetons.add(piocher());
		 }
		chevaletArbitre.remplirChevalet(jetons);
		return chevaletArbitre;
	}
	
	public Chevalet echanger(Chevalet chevalet) {
		Jeton nouveauxJeton= null;
		chevaletArbitre=chevalet;
		chevaletArbitre.recupChevaletliste();
		chevaletArbitre.afficher();
		
		//On demande le jeton que le joueur veut echanger
		System.out.println("choisissez le jeton à échanger");
		Scanner scanner = new Scanner(System.in);
		int jetonchoisi = scanner.nextInt();
		System.out.println("jeton choisi= "+jetonchoisi);
		try {
			System.out.println("passage dans le try");			
			Jeton jetonEchange = chevaletArbitre.chevaltDonne(jetonchoisi);
			System.out.println("passage l1");		
			System.out.println("affiche jeton"+ jetonEchange);	
			sacPourArbitre.sacRecevoir(jetonEchange);
			System.out.println("passage l2");	
			
			nouveauxJeton=piocher();
			System.out.println("passage l3");	
			chevaletArbitre.chevaletRecup(nouveauxJeton);
			System.out.println("passage l4");	
			chevaletArbitre.afficher();
			System.out.println("passage l5");	
			sacPourArbitre.mélanger();
			
		} catch (Exception e) {
			System.out.println("Erreur, Jeton inexistant.");
			return null;
		}
		
		chevaletArbitre.afficher();
		return chevaletArbitre;
        
    }

}
