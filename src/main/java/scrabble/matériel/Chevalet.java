package scrabble.matériel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chevalet {
	
	Sac sac = new Sac();
    
    private List<Jeton> sacRempli = sac.sac();

    public void initialisation() {

        Collections.shuffle(sacRempli);

        List<Jeton> chevalet = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            chevalet.add(sacRempli.get(i));
        }
    }

    public List<Jeton> remplirChevalet() {

        Collections.shuffle(sacRempli);

        List<Jeton> chevalet = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            chevalet.add(sacRempli.get(i));
        }

        return chevalet;
    }
}
