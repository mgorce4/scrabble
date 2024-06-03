package scrabble.materiel;

public enum Lettre {
	JOKER(" "),
	A("a"),
	B("b"),
	C("c"),
	D("d"),
	E("e"),
	F("f"),
	G("g"),
	H("h"),
	I("i"),
	J("j"),
	K("k"),
	L("l"),
	M("m"),
	N("n"),
	O("o"),
	P("p"),
	Q("q"),
	R("r"),
	S("s"),
	T("t"),
	U("u"),
	V("v"),
	W("w"),
	X("x"),
	Y("y"),
	Z("z");
	
	public String code;
	
	private Lettre(String suit) {
		this.code = suit;
	}
	public String code() {
		return this.code;
	}

}
