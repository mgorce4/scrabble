package scrabble.materiel;

public enum Case {
	
	SIMPLE(" "),
	DEBUT("*");
	
	public String code;
	
	private Case(String suit) {
		this.code = suit;
	}
	public String code() {
		return this.code;
	}
	
	
	/*SIMPLE(1,1),
	DEBUT(1,2),
	LETTREDOUBLE(2,1),
	LETTRETRIPLE(3,1),
	MOTDOUBLE(1,2),
	MOTTRIPLE(1,3);
	
	
	private final int multiplierLettre;
	private final int multiplierMot;
	
	Case(int multiplierLettre, int multiplierMot) {
        this.multiplierLettre = multiplierLettre;
        this.multiplierMot = multiplierMot;
    }


    public int multiplierLettre() {
        return this.multiplierLettre;
    }

    public int multiplierMot() {
        return this.multiplierMot;
    }
    */
	 


}
