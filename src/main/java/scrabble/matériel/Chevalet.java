package scrabble.matériel;

import java.util.List;

public class Chevalet {
	    
    private List<Jeton> chevaletliste;
    private String joueur;
    
    public Chevalet() {
        for (int i = 0; i < 7; i++) {
        	chevaletliste.add(Arbitre.Piocher());
        }
        //System.out.println(chevaletliste.size());
    }

   public List<Jeton> retourliste() {
	   return this.chevaletliste;
   }
   
   /*public void changement() {
	   
	   int indexJetonEchange = 2; // Index du jeton à échanger sur le chevalet
	   Arbitre.échanger(chevaletJoueur, indexJetonEchange);
   }*/
      
}
