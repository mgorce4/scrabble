package scrabble.matériel;

public enum Case {
	
	SIMPLE(1,1),
	DEBUT(1,2),
	LettreDouble(2,1),
	LettreTriple(3,1),
	MotDouble(2,1),
	MotTriple(3,1);
	
	private final int multiplierLettre;
	private final int multiplierMot;
	
	Case(int multiplierLettre, int multiplierMot) {
        this.multiplierLettre = multiplierLettre;
        this.multiplierMot = multiplierMot;
    }

    public int letterMultiplier() {
        return this.multiplierLettre;
    }

    public int wordMultiplier() {
        return this.multiplierMot;
    }

}
