package scrabble.matériel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChevaletTest {

	private Chevalet chevalet;

    @BeforeEach
    public void setUp() {
        chevalet = new Chevalet();

    }

    @Test
    public void testRecupChevaletliste() {
        List<Jeton> jetons = chevalet.recupChevaletliste();
        assertEquals(7, jetons.size());

        for (Jeton jeton : jetons) {
            assertNotNull(jeton);
            assertNotNull(jeton.lettre());
            assertNotNull(jeton.point());
        }
    }
}
