package Jour07.Job03.Job03p4;

public class Rectangle extends Figure{
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        super(0, 0);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void affiche() {
        System.out.println("Longueur: " + this.longueur);
        System.out.println("Largeur: " + this.largeur);
    }

    public double surface() {
        return this.longueur * this.largeur;
    }
}
