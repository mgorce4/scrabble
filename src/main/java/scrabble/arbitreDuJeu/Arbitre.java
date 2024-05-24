package scrabble.arbitreDuJeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import scrabble.matériel.Jeton;
import scrabble.matériel.Sac;


public class Arbitre {

	private Jeton piocheArbitre;
	private Sac sacPourArbitre = new Sac();
	
	public Sac RecupeSac() {
		return sacPourArbitre;
	}
	
	public List<Jeton> recupListe() {
		//permet de recuperer la list<Jeton> de l'attribut sacPourArbitre
        return new ArrayList<>(sacPourArbitre.getSacRempli());
    }
	
	public Jeton Piocher() {
        sacPourArbitre.sac();
        sacPourArbitre.mélanger();
		List<Jeton> ListeEstRecup=recupListe();
		Jeton jetonRecup =sacPourArbitre.donner(ListeEstRecup);
        return jetonRecup;
    }
	
	public void échanger(List<Jeton> chevalet) {
		
		System.out.println("choisissez le jeton à échanger");
		Scanner scanner = new Scanner(System.in);
		int jetonchoisi = scanner.nextInt();
		

        Jeton jetonEchange = chevalet.get(jetonchoisi);
		//Sac.recevoir(jetonEchange);
		
        // On récupère le jeton à échanger du chevalet
        
        // On récupère le premier jeton du sac
        Jeton jetonSac = Piocher();
        
        // On remplace le jeton du chevalet par le jeton du sac
        chevalet.set(jetonchoisi, jetonSac);
        
        // On replace le jeton du chevalet dans le sac
        sacPourArbitre.recevoir(jetonEchange);
        
    }

}
