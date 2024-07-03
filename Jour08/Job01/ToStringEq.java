package Jour08.Job01;

public class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5,4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2 :");
        RectangleColore rect1 = new RectangleColore(12.5,4.0,"rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0/2,8.0/2, new String("rouge"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect1));
        System.out.println(rect1.equals(null));
        System.out.println(rect.equals(rect1));
        System.out.println(rect1.equals(rect));
    }
}

class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n largeur = " + largeur + "\n hauteur = " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if (obj == this) {
            return true;
        }
        else if (obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return (rect.getLargeur() == largeur && rect.getHauteur() == hauteur);
    }
}

class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n largeur = " + getLargeur() + "\n hauteur = " + getHauteur() + "\n couleur = " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if (obj == this) {
            return true;
        }
        else if (obj.getClass() != this.getClass()) {
            return false;
        }
        RectangleColore rect = (RectangleColore) obj;
        return (rect.getLargeur() == getLargeur() && rect.getHauteur() == getHauteur() && rect.getCouleur().equals(couleur));
    }
}