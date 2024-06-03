package scrabble.materiel.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import scrabble.materiel.*;
import org.junit.jupiter.api.Test;

public class JetonTest {

    @Test
    public void testJeton() {
        Jeton jeton = new Jeton(Lettre.A, Point.UN);

        assertEquals(Lettre.A, jeton.lettre());
        assertEquals(Point.UN, jeton.point());
    }

    @Test
    public void testToString() {
        Jeton jeton = new Jeton(Lettre.A, Point.UN);
        assertEquals("|a|  pt:1", jeton.toString());
    }
}
