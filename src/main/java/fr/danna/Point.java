package fr.danna;

public class Point {

    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        ctrlAbscisse(x);
        this.x = x;
    }

    public void setY(float y) {
        ctrlOrdonnée(y);
        this.y = y;
    }

    private void ctrlAbscisse(float abscisse) {
        if ((abscisse < 0) || (abscisse > 2000)) {
            throw new IllegalArgumentException("Abscisse incorrecte: " + abscisse);
        }
    }

    private void ctrlOrdonnée(float ordonnée) {
        if ((ordonnée < 0) || (ordonnée > 1000)) {
            throw new IllegalArgumentException("Ordonnée incorrecte: " + ordonnée);
        }
    }

    // Synonyme
    public float getAbscisse() {
        return getX();
    }

    // Synonyme
    public float getOrdonnée() {
        return getY();
    }

    public void translater(float deltaX, float deltaY) {
        setX(x + deltaX);
        setY(y + deltaY);
    }
}
