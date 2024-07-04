package Jour08.Job03;

public class Polymorph {
    public static void main(String[] args) {
        Forme[] tabFormes =
            {
                new Cercle("rouge"),
                new Triangle("jaune")
            };
        Collect formes = new Collect(10);
        for (int i =0; i < tabFormes.length; i++) {
            formes.add(tabFormes[i]); // Delete the 'new' keyword
        }
        formes.dessine();
    }
}

class Forme {
    private String couleur;

    public Forme(String uneCouleur) {
        couleur = uneCouleur;
    }
    public Forme(Forme other) {
        couleur = other.couleur;
    }
    public void dessine() {
        System.out.println("Une forme " + couleur);
    }
}

class Triangle extends Forme {
    public Triangle(String uneCouleur) {
        super(uneCouleur);
    }
    public Triangle(Triangle autreTriangle) {
        super(autreTriangle);
    }
    public void dessine() {
        super.dessine();
        System.out.println("toute pointue");
    }
}

class Cercle extends Forme {
    public Cercle(String uneCouleur) {
        super(uneCouleur);
    }
    public Cercle(Cercle autreCercle) {
        super(autreCercle);
    }
    public void dessine() {
        super.dessine();
        System.out.println("toute ronde");
    }
}

class Collect {
    private Forme collect[];
    private int index;

    public Collect(int indexMax) {
        collect = new Forme[indexMax];
        index = -1;
    }
    public void add(Forme a) {
        if (index < collect.length - 1) {
            index++;
            collect[index] = a;
        }
    }
    public void dessine() {
        for (int i = 0; i <= index; i++) {
            (collect[i]).dessine();
        }
    }
}

/*
1. Bonne question.

2. Il affiche "Une forme rouge" et "Une forme jaune".

 */