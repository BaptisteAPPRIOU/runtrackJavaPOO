package Jour07.Job03.Job03p2;

public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Surface du rectangle: " + rectangle.surface());
        Cercle cercle = new Cercle(5, 0, 0);
        cercle.affiche();
    }
}
