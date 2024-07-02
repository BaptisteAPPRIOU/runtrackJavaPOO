package Jour07.Job03.Job03p4;

public class Figure {
    private double X;
    private double Y;

    public Figure(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public void affiche() {
        System.out.println("Coordonnées du centre : (" + X + ", " + Y + ")");
    }

    public void setCentre(double x, double y) {
        this.X = x;
        this.Y = y;
    }
}
