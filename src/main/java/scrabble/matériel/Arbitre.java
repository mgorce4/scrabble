package scrabble.matériel;

import java.util.ArrayList;
import java.util.List;

import scrabble.application.ScrabbleApplicationConsole;

public class Arbitre {

	private static Jeton piocheArbitre;
	private static Sac sac = new Sac();
		
	public static Sac PrendreSac() {
		return sac;
	}
	
	public static Jeton Piocher() {
		
		//premier code pour remplir le chevalet
    	Sac remplirChevalet = PrendreSac();
    
        piocheArbitre = remplirChevalet.sac().get(0);
        remplirChevalet.sac().remove(0);
        
        return piocheArbitre;
    }

}
