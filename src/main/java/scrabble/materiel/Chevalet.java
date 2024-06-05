package scrabble.materiel;

import java.util.ArrayList;
import java.util.List;

public class Chevalet {
	
    private List<Jeton> chevaletliste;
    
    public Chevalet() {
    	this.chevaletliste=new ArrayList<>();
    }
    
    public List<Jeton> recupChevaletliste() {
		return this.chevaletliste;
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

   public List<Jeton> chevaletRecup(Jeton jeton) {
		chevaletliste.add(jeton);
		return chevaletliste;
	}
   
   public void afficher() {
       for (Jeton jeton : chevaletliste) {
    	   System.out.println(jeton.toString());  
       }
   }
   
}
