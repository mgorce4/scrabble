package scrabble.matériel;



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


}