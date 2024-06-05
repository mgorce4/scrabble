package scrabble.materiel;

public enum Case {
	/* V1
	SIMPLE(" "),
	DEBUT("*");
	
	public String code;
	
	private Case(String suit) {
		this.code = suit;
	}
	public String code() {
		return this.code;
	}
	*/
	
	SIMPLE(1,1),
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

	public String code() {
		if (this == SIMPLE) {
		    return " ";
		  } else if (this == DEBUT) {
		    return "*";
		  } else if (this == LETTREDOUBLE) {
		    return "2";
		  } else if (this == LETTRETRIPLE) {
		    return "3";
		  } else if (this == MOTDOUBLE) {
		    return "²";
		  } else if (this == MOTTRIPLE) {
		    return "³";
		  } else {
		    throw new IllegalStateException("Invalid Tile type: " + this);
		  }
		}

    public int multiplierLettre() {
        return this.multiplierLettre;
    }

    public int multiplierMot() {
        return this.multiplierMot;
    }
    
	 


}
