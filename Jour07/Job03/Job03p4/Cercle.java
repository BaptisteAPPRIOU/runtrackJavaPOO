package Jour07.Job03.Job03p4;

public class Cercle extends Figure{
    protected double rayon;
    protected double x;
    protected double y;

    public Cercle(double rayon, double x, double y) {
        super(x, y);
        this.rayon = rayon;
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Rayon: " + this.rayon);
        System.out.println("Centre: (" + this.x + ", " + this.y + ")");
    }

    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public boolean estInterieur(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) <= Math.pow(this.rayon, 2);
    }

}
