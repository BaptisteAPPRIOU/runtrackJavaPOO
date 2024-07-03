package Jour08.Job02;

public class Magic {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        
        Terrain terrain = new Terrain("B");
        Creature creature = new Creature("Goblin", 2, 2, 2);
        Sortilege sortilege = new Sortilege("Fireball", "Deal 3 damage to target creature or player", 2);
        jeu.piocher(terrain);
        jeu.piocher(creature);
        jeu.piocher(sortilege);
        jeu.jouer();
        jeu.afficher();
    }
}

class Carte {
    private int cout;
    
    public Carte(int cout) {
        this.cout = cout;
        System.out.println("Type: Carte");
    }
    
    public void afficher() {
        System.out.println("Coût: " + cout);
    }
}

class Terrain extends Carte {
    private String couleur;
    
    public Terrain(String couleur) {
        super(0);
        this.couleur = couleur;
        System.out.println("Type: Terrain");
    }
    
    public void afficher() {
        super.afficher();
        System.out.println("Couleur: " + couleur);
    }
}

class Creature extends Carte {
    private String nom;
    private int degats;
    private int pointsDeVie;
    
    public Creature(String nom, int degats, int pointsDeVie, int cout) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.pointsDeVie = pointsDeVie;
        System.out.println("Type: Créature");
    }
    
    public void afficher() {
        super.afficher();
        System.out.println("Nom: " + nom);
        System.out.println("Dégâts: " + degats);
        System.out.println("Points de vie: " + pointsDeVie);
    }
}

class Sortilege extends Carte {
    private String nom;
    private String explication;
    
    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Type: Sortilège");
    }
    
    public void afficher() {
        super.afficher();
        System.out.println("Nom: " + nom);
        System.out.println("Explication: " + explication);
    }
}

class Jeu {
    private Carte[] cartes;
    private int nombreCartes;
    
    public Jeu() {
        cartes = new Carte[10];
        nombreCartes = 0;
    }
    
    public void piocher(Carte carte) {
        if (nombreCartes < 10) {
            cartes[nombreCartes] = carte;
            nombreCartes++;
        }
    }
    
    public void jouer() {
        for (int i = 0; i < nombreCartes; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
                cartes[i] = null;
            }
        }
    }
    
    public void afficher() {
        for (int i = 0; i < nombreCartes; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
            }
        }
    }
}