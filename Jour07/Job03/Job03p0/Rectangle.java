package Jour07.Job03.Job03p0;

public class Rectangle {
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface() {
        return this.longueur * this.largeur;
    }
}
