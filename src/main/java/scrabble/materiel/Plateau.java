package scrabble.materiel;

public class Plateau {
    private static final Integer TAILLE = 15;
    private static final Integer CENTRE = TAILLE/2;

    
    private Case[][] plateau;
    private Jeton[][] jetons;

    public Plateau() {
        creerPlateau();
    }

    public void creerPlateau() {
    	this.plateau = new Case[TAILLE][TAILLE];
    	this.jetons = new Jeton[TAILLE][TAILLE];
        for(int ligne = 0; ligne < TAILLE; ligne ++) {
            for(int colonne = 0; colonne < TAILLE; colonne++) {
            	plateau[ligne][colonne] = Case.SIMPLE;
            }
        }
        plateau[CENTRE][CENTRE] = Case.DEBUT;
        
        plateau[0][0] = Case.MOTTRIPLE;
        plateau[7][0] = Case.MOTTRIPLE;
        plateau[0][7] = Case.MOTTRIPLE;
        plateau[14][0] = Case.MOTTRIPLE;
        plateau[0][14] = Case.MOTTRIPLE;
        plateau[7][14] = Case.MOTTRIPLE;
        plateau[14][7] = Case.MOTTRIPLE;
        plateau[14][14] = Case.MOTTRIPLE;
        
        plateau[1][1] = Case.MOTDOUBLE;
        plateau[13][13] = Case.MOTDOUBLE;
        plateau[12][12] = Case.MOTDOUBLE;
        plateau[2][2] = Case.MOTDOUBLE;
        plateau[3][3] = Case.MOTDOUBLE;
        plateau[11][11] = Case.MOTDOUBLE;
        plateau[4][4] = Case.MOTDOUBLE;
        plateau[10][10] = Case.MOTDOUBLE;
        plateau[10][4] = Case.MOTDOUBLE;
        plateau[4][10] = Case.MOTDOUBLE;
        plateau[3][11] = Case.MOTDOUBLE;
        plateau[11][3] = Case.MOTDOUBLE;
        plateau[12][2] = Case.MOTDOUBLE;
        plateau[2][12] = Case.MOTDOUBLE;
        plateau[1][13] = Case.MOTDOUBLE;
        plateau[13][1] = Case.MOTDOUBLE;
        
        plateau[3][0] = Case.LETTREDOUBLE;
        plateau[0][3] = Case.LETTREDOUBLE;
        plateau[11][0] = Case.LETTREDOUBLE;
        plateau[0][11] = Case.LETTREDOUBLE;
        plateau[6][2] = Case.LETTREDOUBLE;
        plateau[2][6] = Case.LETTREDOUBLE;
        plateau[3][7] = Case.LETTREDOUBLE;
        plateau[7][3] = Case.LETTREDOUBLE;
        plateau[6][6] = Case.LETTREDOUBLE;
        plateau[8][2] = Case.LETTREDOUBLE;
        plateau[2][8] = Case.LETTREDOUBLE;
        plateau[3][0] = Case.LETTREDOUBLE;
        plateau[3][14] = Case.LETTREDOUBLE;
        plateau[14][3] = Case.LETTREDOUBLE;
        plateau[8][6] = Case.LETTREDOUBLE;
        plateau[6][8] = Case.LETTREDOUBLE;
        plateau[8][8] = Case.LETTREDOUBLE;
        plateau[6][12] = Case.LETTREDOUBLE;
        plateau[7][11] = Case.LETTREDOUBLE;
        plateau[8][12] = Case.LETTREDOUBLE;
        plateau[11][14] = Case.LETTREDOUBLE;
        plateau[14][11] = Case.LETTREDOUBLE;
        plateau[11][7] = Case.LETTREDOUBLE;
        plateau[12][6] = Case.LETTREDOUBLE;
        plateau[12][8] = Case.LETTREDOUBLE;

        plateau[1][5] =Case.LETTRETRIPLE;
        plateau[1][9] =Case.LETTRETRIPLE;
        plateau[5][1] =Case.LETTRETRIPLE;
        plateau[9][1] =Case.LETTRETRIPLE;
        plateau[5][5] =Case.LETTRETRIPLE;
        plateau[9][9] =Case.LETTRETRIPLE;
        plateau[5][13] =Case.LETTRETRIPLE;
        plateau[9][13] =Case.LETTRETRIPLE;
        plateau[9][5] =Case.LETTRETRIPLE;
        plateau[9][9] =Case.LETTRETRIPLE;
        plateau[13][5] = Case.LETTRETRIPLE;
        plateau[13][9] = Case.LETTRETRIPLE;
        plateau[5][9] = Case.LETTRETRIPLE;


    }
    


    public void placerJeton(Jeton jeton, int colonne, int ligne) {
        jetons[ligne][colonne] = jeton;
    }

    public Jeton[][] jetons() {
        return jetons;
    }

    public Case[][] plateau() {
        return plateau;
    }

    public Case prendrePlateauA(Positions positions) {
        return this.plateau[positions.ligne()][positions.colonne()];
    }

    public Jeton prendreJetonA(Positions positions) {
        return this.jetons[positions.ligne()][positions.colonne()];
    }


    
    public void afficherPlateau() {
    	// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/ pour comprendre StringBuilder
    	StringBuilder affichage = new StringBuilder();
    	for (int i=0;i< TAILLE; i++) {
    		affichage.append(" ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ \n");
    		for (Case cases : this.plateau[i]) {
    			affichage.append("| ");
        		affichage.append(cases.code());
        		affichage.append(" ");
    		}
    		affichage.append("|\n");
    		affichage.append("|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___| \n");    	
    	}
    	System.out.println(affichage.toString());
    }
    
  
  

    



}