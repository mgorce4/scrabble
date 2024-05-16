package scrabble.matériel;

import java.util.ArrayList;
import java.util.List;

public class Chevalet {
	    
    private List<Jeton> chevaletliste;
    private List<Jeton> chevaletJoueur;
    private String joueur;
    
    public Chevalet() {
    	chevaletliste = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
        	chevaletliste.add(Arbitre.Piocher());
        }
    }

   public List<Jeton> retourliste() {
	   return this.chevaletliste;
   }
   
   public List<Jeton> changement() {
	   chevaletJoueur = retourliste();
	   int indexJetonEchange = 2; //Index du jeton à échanger sur le chevalet
	   Arbitre.échanger(chevaletJoueur, indexJetonEchange);
	   
	   return chevaletJoueur;
   }
   
}
