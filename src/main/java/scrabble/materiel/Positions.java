package scrabble.materiel;

public class Positions {
	private Integer colonne;
	private Integer ligne;
	
	public Positions(Integer colonne, Integer ligne) {
		this.colonne = colonne;
		this.ligne = ligne;
		
	}

	public Integer colonne() {
        return colonne;
    }

    public Integer ligne() {
        return ligne;
    }


    @Override
    public String toString() {
        return "Position{" +
                "colonne=" + colonne +
                ", ligne=" + ligne +
                '}';
    }

	
}
