package scrabble.matériel;

public enum Point {
	ZERO("0"),
	UN("1"),
	DEUX("2"),
	TROIS("3"),
	QUATRE("4"),
	HUIT("8"),
	DIX("10")
	;
	
	public String code;
	
	private Point(String suit) {
		this.code = suit;
	}
	public String code() {
		return this.code;
	}

}
