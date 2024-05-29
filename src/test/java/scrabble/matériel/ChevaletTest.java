package scrabble.matériel;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChevaletTest {

    @Test
    public void testChevaletCreation() {
        Chevalet chevalet = new Chevalet();
        List<Jeton> jetons = chevalet.recupChevaletliste();

        Assertions.assertEquals(7, jetons.size()); // Check if 7 jetons are created
    }

    @Test
    public void testChevaletDonne() throws Exception {
        Chevalet chevalet = new Chevalet();
        int jetonIndex = 3;

        Jeton jeton = chevalet.chevaltDonne(jetonIndex);

        Assertions.assertNotNull(jeton); // Check if jeton is not null
        Assertions.assertEquals(6, chevalet.recupChevaletliste().size()); // Check if jeton is removed
    }

    @Test
    public void testChevaletDonneIndexOutOfBounds() {
        Chevalet chevalet = new Chevalet();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> chevalet.chevaltDonne(10)); // Index out of bounds
    }

    @Test
    public void testChevaletRecup() {
        Chevalet chevalet = new Chevalet();
        Jeton jeton = chevalet.recupChevaletliste().get(0);
        chevalet.chevaletRecup(jeton);

        Assertions.assertEquals(7, chevalet.recupChevaletliste().size()); // Check if adding doesn't duplicate
    }
}