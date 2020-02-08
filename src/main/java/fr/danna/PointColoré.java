package fr.danna;

public class PointColoré extends Point {

    private Couleur couleur;

    public PointColoré(float x, float y, int r, int v, int b) {
        super(x, y);
        this.couleur = new Couleur(r, v, b);
    }

    public PointColoré(float x, float y, Couleur couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public PointColoré(Point point, Couleur couleur) {
        super(point.getX(), point.getY());
        this.couleur = couleur;
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
        return "(" + getAbscisse() + " ; " + getOrdonnée() + ")[" + couleur.nuanceRouge() + "," + couleur.nuanceVert() + "," + couleur.nuanceBleu() + "]";
    }
}
