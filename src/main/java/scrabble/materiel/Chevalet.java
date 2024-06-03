package scrabble.materiel;

import java.util.ArrayList;
import java.util.List;
import scrabble.arbitreDuJeu.Arbitre;

public class Chevalet {
	
    private List<Jeton> chevaletliste;
    
    public List<Jeton> recupChevaletliste() {
		return this.chevaletliste;
	}

	public void setChevaletliste(List<Jeton> chevaletliste) {
		this.chevaletliste = chevaletliste;
	}

	public void remplirChevalet(List<Jeton> jetons) {
    	chevaletliste = new ArrayList<>();
        	chevaletliste.addAll(jetons);
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
   
   public void afficher() {
	   System.out.println("Voici le chevalet rempli :");
       for (Jeton jeton : chevaletliste) {
    	   System.out.println(jeton.toString());    
       }
   }
   
}
