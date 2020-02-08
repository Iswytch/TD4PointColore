package fr.danna;

public class PointAvecCouleur {

    private Point point;
    private Couleur couleur;

    public PointAvecCouleur(float x, float y, int r, int v, int b) {
        this.point = new Point(x, y);
        this.couleur = new Couleur(r, v, b);
    }

    public PointAvecCouleur(float x, float y, Couleur couleur) {
        this.point = new Point(x, y);
        this.couleur = couleur;
    }

    public PointAvecCouleur(Point point, Couleur couleur) {
        this.point = point;
        this.couleur = couleur;
    }

    public Point getPoint() {
        return point;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public int nuanceVert() {
        return couleur.nuanceVert();
    }

    public void modifierNuanceVert(byte vert) {
        couleur.vert = vert;
    }

    // Juste pour déboguer.
    @Override
    public String toString() {
        return "(" + point.getAbscisse() + " ; " + point.getOrdonnée() + ")[" + couleur.nuanceRouge() + "," + couleur.nuanceVert() + "," + couleur.nuanceBleu() + "]";
    }
}
