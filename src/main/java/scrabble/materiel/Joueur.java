package scrabble.materiel;

public class Joueur {
	private Chevalet jChevalet;
	private String nom;
	private Integer score;
	
	public Joueur(String nom) {
		this.jChevalet=new Chevalet();
		this.nom=nom;
		this.score = 0;
	}
	
	public Chevalet getjChevalet() {
		return this.jChevalet;
	}
	
	public void setjChevalet(Chevalet jChevalet) {
		this.jChevalet = jChevalet;
	}
	
	public int score() {
		return this.score;
	}
	
	public void ajouterAuScore(int score) {
		this.score += score;
	}
}
