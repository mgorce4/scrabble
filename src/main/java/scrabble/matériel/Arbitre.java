package scrabble.matériel;

import java.util.List;
import java.util.Scanner;
import scrabble.matériel.*;


public class Arbitre {

	private Jeton piocheArbitre;
	private Sac sacPourArbitre = new Sac();
	
	public Sac RecupeSac() {
		return sacPourArbitre;
	}
	
	public Jeton Piocher() {
		Jeton jetonRecup =sacPourArbitre.donner();
        return jetonRecup;
    }
	
	public void échanger(List<Jeton> chevalet) {
		System.out.println("choisissez le jeton à échanger");
		Scanner scanner = new Scanner(System.in);
		int jetonchoisi = scanner.nextInt();
		
        // On récupère le jeton à échanger du chevalet
        Jeton jetonEchange = chevalet.get(jetonchoisi);
        
        // On récupère le premier jeton du sac
        Jeton jetonSac = Piocher();
        
        // On remplace le jeton du chevalet par le jeton du sac
        chevalet.set(jetonchoisi, jetonSac);
        
        // On replace le jeton du chevalet dans le sac
        sacPourArbitre.recevoir(jetonEchange);
        
    }

}
