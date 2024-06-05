package scrabble.arbitreDuJeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import scrabble.materiel.*;


public class Arbitre {
	private Sac sacPourArbitre = new Sac();
	private Joueur joueur1 = new Joueur("joueur1");
	private Jeton jetons;
	
	public Jeton piocher() {
        this.sacPourArbitre.mélanger();
		List<Jeton> listeEstRecup=sacPourArbitre.recupSacRempli();
		Jeton jetonRecup=sacPourArbitre.donnerSac(listeEstRecup);
        return jetonRecup;
    }
	
	public void initierChevalet(){
		 for (int i = 0; i < 7; i++) {
			 jetons=piocher();
			 System.out.println(jetons);
			 joueur1.getjChevalet().chevaletRecup(jetons);
		 }
	}
	
	public Chevalet echanger(Chevalet chevalet) {
		Chevalet chevaletArbitre=joueur1.getjChevalet();
		Jeton nouveauxJeton= null;
		
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
