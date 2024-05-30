/* package scrabble.matériel;

public class Plateau {
	

	private static int nbLig;
	private static int nbCol;
	private char [][] plateau;
	

	public Plateau (int n, int p){
		nbLig = n;
		nbCol = p;
		plateau = new char[nbLig][nbCol];

		for(int i = 0; i<nbLig; i++) {
			for(int j = 0; j<nbCol; j++) {
				

				plateau[i][j] = 'x';				

			}
		}
	}
	

	

	
	public void afficher(){
		System.out.println();
		for (int i=0; i<nbLig; i++) {
			for (int j=0; j<nbCol; j++) {
				
				System.out.print(" | " + plateau[i][j]);
				
				
				
			}
			System.out.println(" |");
		}
		System.out.println();
	}
}

*/ 





package scrabble.matériel;



public class Plateau {

	Case[][] plateauJeu;

	public Plateau() {

		CreerPlateau();

	}



	public void CreerPlateau() {

		plateauJeu = new Case[15][15];

		for(int i = 0; i < 15; i ++) {

			for(int j = 0; j < 15; j++) {

				plateauJeu[i][j] = Case.SIMPLE;

			}

		}

	}

}
		



