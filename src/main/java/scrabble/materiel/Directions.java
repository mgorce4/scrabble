package scrabble.materiel;

public enum Directions {

	HORIZONTALE,
	VERTICALE;
	public Directions rotate() {
        return this == Directions.HORIZONTALE ? Directions.VERTICALE : Directions.HORIZONTALE;
    }

}
