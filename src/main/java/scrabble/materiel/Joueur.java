package scrabble.materiel;

public class Joueur {
	private Chevalet jChevalet;
	private String nom;
	//private Integer score;
	
	public Joueur(String nom) {
		this.jChevalet=new Chevalet();
		this.nom=nom;
	}
	
	public Chevalet getjChevalet() {
		return this.jChevalet;
	}
	
	public void setjChevalet(Chevalet jChevalet) {
		this.jChevalet = jChevalet;
	}
}
