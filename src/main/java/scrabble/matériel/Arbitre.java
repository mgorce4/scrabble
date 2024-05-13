package scrabble.matériel;

import java.util.ArrayList;
import java.util.List;

import scrabble.application.ScrabbleApplicationConsole;

public class Arbitre {

	private List<Jeton> piocheArbitre;
	private static Sac sac = new Sac();
		
	public Sac PrendreSac() {
		return sac;
	}
	
	public static List<Jeton> Piocher() {
		
		//premier code pour remplir le chevalet
		piocheArbitre = new ArrayList<Jeton>();
    	Sac remplirChevalet = PrendreSac();
    
        piocheArbitre.add(Sac.Remove(1));
        
        return piocheArbitre;
    }

}
