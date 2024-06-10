package scrabble.arbitreDuJeu;

import java.util.List;
import java.util.Scanner;
import scrabble.materiel.*;


public class Arbitre {
	private Sac sacPourArbitre;
	private Joueur joueur1;
	private Jeton jetons;
	
	
	public Arbitre(String nom) {
		sacPourArbitre = new Sac();
		joueur1 = new Joueur(nom);
	}
	
	public Jeton piocher() {
        this.sacPourArbitre.mélanger();
		List<Jeton> listeEstRecup=sacPourArbitre.recupSacRempli();
		Jeton jetonRecup=sacPourArbitre.donnerSac(listeEstRecup);
        return jetonRecup;
    }
	
	public void initierChevalet(){
		 for (int i = 0; i < 7; i++) {
			 jetons=piocher();
			 joueur1.getjChevalet().chevaletRecup(jetons);
		 }
	}
	
	public Joueur joueur() {
		return joueur1;
	}
	
	
	public Chevalet echanger(Chevalet chevalet) {
		Chevalet chevaletArbitre=joueur1.getjChevalet();
		Jeton nouveauxJeton= null;
		
		//On demande le jeton que le joueur veut echanger
		System.out.println("choisissez le jeton à échanger");
		Scanner scanner = new Scanner(System.in);
		int jetonchoisi = scanner.nextInt()-1;
		
		try {		
			Jeton jetonEchange = chevaletArbitre.chevaltDonne(jetonchoisi);
			sacPourArbitre.sacRecevoir(jetonEchange);
			nouveauxJeton=piocher();
			chevaletArbitre.chevaletRecup(nouveauxJeton);
			sacPourArbitre.mélanger();
			
		} catch (Exception e) {
			System.out.println("Erreur, Jeton inexistant.");
			return null;
		}
		
		chevaletArbitre.afficher();
		return chevaletArbitre;
        
    }

}
