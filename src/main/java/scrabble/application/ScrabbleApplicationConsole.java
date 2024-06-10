package scrabble.application;

import java.util.List;
import java.util.Scanner;
import scrabble.arbitreDuJeu.Arbitre;
import scrabble.materiel.*;

public class ScrabbleApplicationConsole {
	private Arbitre arbitre;
	private Plateau plateau= new Plateau();
	private Chevalet chevaletMain;
	
	private static final String LIGNE_HORIZONTALE = "-------------------------------------------------------";
	
	public ScrabbleApplicationConsole(String nom) {
		this.arbitre=new Arbitre(nom);
	}
	
	public static void message(String texte) {
		System.out.println(texte);
	}
	
	public static Integer scannerNbr() {
		message("Entrer le nom du joueur :");
		Scanner scanner = new Scanner(System.in);
		int nbr = scanner.nextInt();
		return nbr;
	}
	
	public static void main(String[] args) {
		
		message(LIGNE_HORIZONTALE);
		message("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		message("-------- Développé par mgorce, jcourty, Marius --------");
		message(LIGNE_HORIZONTALE);
		
		message("Entrer le nom du joueur :");
		Scanner scanner = new Scanner(System.in);
		String nom = scanner.next();
		
		message("Bienvenue " + nom+ " !");
		message("");
		new ScrabbleApplicationConsole(nom).lancement();
	}
	
	public void lancement() {
		Joueur joueur = arbitre.joueur();
		arbitre.initierChevalet();
		chevaletMain = joueur.getjChevalet();
		
		message("Voici vos choix :");
		message("1-Échanger des pions");
		message("2-Jouer"); //pour posser les pions
		message("3-Quitter");
		int i=scannerNbr();
		
		while(i!=3) {
			if (i==1) {
				this.choix1();
				break;
			}
			if (i==2) {
				this.choix2();
				break;
			}
		}
	}
	
	public void choix1() {
		chevaletMain.afficher();
		arbitre.echanger(chevaletMain);
	}
		
	public void choix2() {
		plateau.afficherPlateau();
		chevaletMain.afficher();
		
		message("Choisir le jeton à poser :");
		int i=scannerNbr();
		message("Choisir la colonne :");
		int colonne=scannerNbr();
		message("Choisir la ligne :");
		int ligne=scannerNbr();
		
		Jeton jeton=chevaletMain.chevaltDonne(i);
		
		plateau.placerJeton(jeton, colonne, ligne);
		plateau.afficherPlateau();
	}
	
	
}