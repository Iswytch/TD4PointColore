package fr.danna;

public class Couleur {

    public final static Couleur ROUGE = new Couleur(255, 0, 0);
    public final static Couleur BLEU = new Couleur(0, 0, 255);

    public byte rouge;
    public byte vert;
    public byte bleu;

    public Couleur(byte rouge, byte vert, byte bleu) {
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

    public Couleur(int rouge, int vert, int bleu) {
        this((byte)rouge, (byte)vert, (byte)bleu);
    }

    public int nuanceRouge() {
        return Byte.toUnsignedInt(rouge);
    }

    public int nuanceVert() {
        return Byte.toUnsignedInt(vert);
    }

    public int nuanceBleu() {
        return Byte.toUnsignedInt(bleu);
    }

    public int valeurRGB() {
        return (((Byte.toUnsignedInt(rouge)* 256) + Byte.toUnsignedInt(vert)) * 256) + Byte.toUnsignedInt(bleu);
    }

    // Juste pour déboguer.
    @Override
    public String toString() {
        return "rouge=" + nuanceRouge() +
               ", vert=" + nuanceVert() +
               ", bleu=" + nuanceBleu();
    }
}
