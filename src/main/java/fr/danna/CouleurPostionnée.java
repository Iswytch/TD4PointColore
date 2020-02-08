package fr.danna;

public class CouleurPostionnée extends Couleur {

    private Point point;

    public CouleurPostionnée(int r, int v, int b, float x, float y) {
        super(r, v, b);
        this.point = new Point(x, y);
    }

    public CouleurPostionnée(int r, int v, int b, Point point) {
        super(r, v, b);
        this.point = point;
    }

    public CouleurPostionnée(Couleur couleur, Point point) {
        super(couleur.rouge, couleur.vert, couleur.bleu);
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }


    // Juste pour déboguer.
    @Override
    public String toString() {
        return "(" + point.getAbscisse() + " ; " + point.getOrdonnée() + ")[" + nuanceRouge() + "," + nuanceVert() + "," + nuanceBleu() + "]";
    }
}
