package scrabble.matériel;

import java.util.ArrayList;
import java.util.List;
import scrabble.arbitreDuJeu.Arbitre;

public class Chevalet {
	
    private List<Jeton> chevaletliste;
    private List<Jeton> chevaletJoueur;
    private String joueur;
    Arbitre arbitre= new Arbitre();
    
    public List<Jeton> recupChevaletliste() {
		return chevaletliste;
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
    

   public List<Jeton> retourliste() {
	   return this.chevaletliste;
   }
   
   public List<Jeton> changement(Chevalet chevaletDuMain) {
	   chevaletJoueur = retourliste();
	   arbitre.échanger(chevaletDuMain);
	   return chevaletJoueur;
   }
   
   public Jeton donnerJeton(int numDuJeton) {
	    if (!chevaletliste.isEmpty()) {
	        Jeton result = chevaletliste.get(numDuJeton);
	        chevaletliste.remove(result);
	        return result;
	    } else {
	    	System.out.println("Le chevalet est vide");
	        return null;
	    }
	}
   
}
