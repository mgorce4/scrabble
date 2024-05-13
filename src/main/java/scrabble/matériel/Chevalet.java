package scrabble.matériel;


import java.util.ArrayList;
import java.util.List;

public class Chevalet {
	    
    private List<Jeton> chevaletliste;
    private String joueur;
    
    public Chevalet() {

        for (int i = 0; i < 7; i++) {
        	chevaletliste=Arbitre.Piocher();
        }
        System.out.println(chevaletliste.size());
    }

   public List<Jeton> retourliste() {
	   return this.chevaletliste;
   }
}
