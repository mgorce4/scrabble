package scrabble.matériel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sac {
	
	private List<Jeton> sacRempli;

	public List<Jeton> sac() {
		List<Jeton>sacRempli =new ArrayList<Jeton>();
		for (int i=0; i<15;i++) {
			sacRempli.add(new Jeton(Lettre.E,Point.UN));
		}
		for (int i=0;i<9;i++) {
			sacRempli.add(new Jeton(Lettre.A,Point.UN));
		}
		for (int i=0; i<8;i++) {
			sacRempli.add(new Jeton(Lettre.I,Point.UN));
		}
		for (int i=0;i<6;i++) {
			sacRempli.add(new Jeton(Lettre.N,Point.UN));
			sacRempli.add(new Jeton(Lettre.O,Point.UN));
			sacRempli.add(new Jeton(Lettre.R,Point.UN));
			sacRempli.add(new Jeton(Lettre.S,Point.UN));
			sacRempli.add(new Jeton(Lettre.T,Point.UN));
			sacRempli.add(new Jeton(Lettre.U,Point.UN));
		}
		for (int i=0;i<5;i++) {
			sacRempli.add(new Jeton(Lettre.L,Point.UN));
		}
		for(int i=0;i<3;i++) {
			sacRempli.add(new Jeton(Lettre.D,Point.DEUX));
			sacRempli.add(new Jeton(Lettre.M,Point.DEUX));
		}
		for(int i=0;i<2;i++) {
			sacRempli.add(new Jeton(Lettre.JOKER,Point.ZERO));
			sacRempli.add(new Jeton(Lettre.G,Point.DEUX));
			sacRempli.add(new Jeton(Lettre.B,Point.TROIS));
			sacRempli.add(new Jeton(Lettre.C,Point.TROIS));
			sacRempli.add(new Jeton(Lettre.P,Point.TROIS));
			sacRempli.add(new Jeton(Lettre.F,Point.TROIS));
			sacRempli.add(new Jeton(Lettre.H,Point.TROIS));
			sacRempli.add(new Jeton(Lettre.V,Point.TROIS));
		}
		sacRempli.add(new Jeton(Lettre.B,Point.TROIS));
		
		
		//collections.shuffle -> mélange notre sac
        Collections.shuffle(sacRempli);
		return sacRempli; 
		
	}


}


