package fr.danna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CouleurTest {

    @Test
    void testConstanteRouge() {
        assertEquals(255, Couleur.ROUGE.nuanceRouge());
        assertEquals(0, Couleur.ROUGE.nuanceVert());
        assertEquals(0, Couleur.ROUGE.nuanceBleu());
    }

    @Test
    void testNuances() {
        Couleur coul1 = new Couleur(0, 128, 255);
        assertEquals(0, Byte.toUnsignedInt(coul1.rouge));
        assertEquals(128, Byte.toUnsignedInt(coul1.vert));
        assertEquals(255, Byte.toUnsignedInt(coul1.bleu));

        assertEquals(0, coul1.nuanceRouge());
        assertEquals(128, coul1.nuanceVert());
        assertEquals(255, coul1.nuanceBleu());
    }

    @Test
    void testValeurRGB() {
        Couleur coul1 = new Couleur(127, 128, 129);
        int rgb1 = coul1.valeurRGB();
        assertEquals((127 * 256 * 256) + (128 * 256) + 129, rgb1);
    }
}