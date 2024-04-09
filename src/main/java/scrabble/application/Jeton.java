package scrabble.application;

public class Jeton {
	private Lettre lettre;
	private Point point;
	
	public Jeton(Lettre lettre,Point point) {
		this.lettre = lettre;
		this.point = point;
	}
	
	public Lettre lettre() {
		return lettre;
	}
	
	public Point point() {
		return point;
	}
	
	public String ToText() {
		return lettre.code() + point.code();
	}

}
