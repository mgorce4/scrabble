package scrabble.matériel;

import java.util.ArrayList;
import java.util.List;
import scrabble.arbitreDuJeu.Arbitre;

public class Chevalet {
	
    private List<Jeton> chevaletliste;
    private String joueur;
    Arbitre arbitre= new Arbitre();
    
    public List<Jeton> recupChevaletliste() {
		return this.chevaletliste;
	}

	public void setChevaletliste(List<Jeton> chevaletliste) {
		this.chevaletliste = chevaletliste;
	}

	public Chevalet() {
    	chevaletliste = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
        	chevaletliste.add(arbitre.piocher());
        }
    }

   public Jeton chevaltDonne(int numDuJeton) {
	    if (!chevaletliste.isEmpty()) {
	        Jeton result = chevaletliste.get(numDuJeton);
	        chevaletliste.remove(result);
	        return result;
	    } else {
	    	System.out.println("Le chevalet est vide");
	        return null;
	    }
	}

   public void chevaletRecup(Jeton jeton) {
		recupChevaletliste().add(jeton);
	}
   
}
