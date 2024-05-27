package scrabble.matériel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class ChevaletTest {

	@Test
	public void testChangementChevalet() {
	    Chevalet chevalet = new Chevalet();
	    List<Jeton> jetonsInitiaux = chevalet.retourliste();

	    // Changer le chevalet
	    List<Jeton> jetonsChangés = chevalet.changement();

	    // Vérifier que le nombre de jetons sur le chevalet n'a pas changé
	    assertEquals(jetonsInitiaux.size(), jetonsChangés.size());

	    // Vérifier que certains jetons ont changé
	    boolean jetonChangé = false;
	    for (int i = 0; i < jetonsInitiaux.size(); i++) {
	        if (!jetonsInitiaux.get(i).equals(jetonsChangés.get(i))) {
	            jetonChangé = true;
	            break;
	        }
	    }
	    assertTrue(jetonChangé);
	}


}
