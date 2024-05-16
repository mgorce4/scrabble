package scrabble.matériel;

import java.util.List;

public class Arbitre {

	private static Jeton piocheArbitre;
	private static Sac sac = new Sac();
		
	public static Sac RecupeSac() {
		return sac;
	}
	
	public static Jeton Piocher() {
    	Sac sacArbitre = RecupeSac();
        piocheArbitre = sacArbitre.sac().get(0);
        sacArbitre.sac().remove(0);
        return piocheArbitre;
    }
	
	public static void échanger(List<Jeton> chevalet, int indexJetonChevalet) {
        // On récupère le jeton à échanger du chevalet
        Jeton jetonEchange = chevalet.get(indexJetonChevalet);
        
        // On récupère le premier jeton du sac
        Jeton jetonSac = Piocher();
        
        // On remplace le jeton du chevalet par le jeton du sac
        chevalet.set(indexJetonChevalet, jetonSac);
        
        // On replace le jeton du chevalet dans le sac
        sac.sac().add(jetonEchange);
    }
	

}
