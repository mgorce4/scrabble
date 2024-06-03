package scrabble.materiel;

public class Plateau {
    private static final Integer TAILLE = 15;
    private static final Integer CENTRE = 7;

    Case[][] plateauJeu;

    public Plateau() {
        creerPlateau();
    }

    public void creerPlateau() {
        plateauJeu = new Case[TAILLE][TAILLE];
        for(int i = 0; i < TAILLE; i ++) {
            for(int j = 0; j < TAILLE; j++) {
                plateauJeu[i][j] = Case.SIMPLE;
            }
        }
        plateauJeu[CENTRE][CENTRE] = Case.DEBUT;
    }
    
    public void afficherPlateau() {
    	// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/ pour comprendre StringBuilder
    	StringBuilder affichage = new StringBuilder();
    	for (int i=0;i< TAILLE; i++) {
    		affichage.append(" ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ \n");
    		for (Case plateauJeu : this.plateauJeu[i]) {
    			affichage.append("| ");
        		affichage.append(plateauJeu.code());
        		affichage.append(" ");
    		}
    		affichage.append("|\n");
    		affichage.append("|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___| \n");    	
    	}
    	System.out.println(affichage.toString());
    }


}