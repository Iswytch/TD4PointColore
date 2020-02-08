package fr.danna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointColoréTest {

    @Test
    void testCoordonnées() {
        PointColoré pointColoré1 = new PointColoré(new Point(6.0F, 7.0F), new Couleur(1, 2, 3));
        assertEquals(6.0F, pointColoré1.getAbscisse());
        assertEquals(7.0F, pointColoré1.getOrdonnée());

        PointColoré pointColoré2 = new PointColoré(8.0F, 9.0F, 1, 2, 3);
        assertEquals(8.0F, pointColoré2.getAbscisse());
        assertEquals(9.0F, pointColoré2.getOrdonnée());
    }

    @Test
    void testTranslater() {
        PointColoré pointColoré1 = new PointColoré(6.0F, 7.0F, new Couleur(1, 2, 3));
        pointColoré1.translater(1.0F, 2.0F);
        assertEquals(7.0F, pointColoré1.getAbscisse());
        assertEquals(9.0F, pointColoré1.getOrdonnée());
    }
}