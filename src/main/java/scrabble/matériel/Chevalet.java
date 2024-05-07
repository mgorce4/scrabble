package scrabble.matériel;


import java.util.ArrayList;
import java.util.List;

public class Chevalet {
	    
    private List<Jeton> chevaletliste;
    private String joueur;
    
    public Chevalet() {
    	
    	chevaletliste=new ArrayList<Jeton>();
    	Sac sac = new Sac(); // créer un sac par joueur 
    	List<Jeton> sacRempli = sac.sac();
    	
    	System.out.println(sacRempli.size());

        for (int i = 0; i < 7; i++) {
        	chevaletliste.add(sacRempli.remove(0));
        }
        System.out.println(sacRempli.size());
    }

   public List<Jeton> retourliste() {
	   return this.chevaletliste;
   }
}
