package fr.danna;

import fr.danna.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testSynonymes() {
        Point point1 = new Point(3, 7);
        assertEquals(3, point1.getAbscisse());
        assertEquals(7, point1.getOrdonnée());
    }
}