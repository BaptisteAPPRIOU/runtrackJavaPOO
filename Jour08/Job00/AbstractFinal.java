package Jour08.Job00;

public class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        tab[0] = new A();   // Erreur : A est abstrait
        tab[1] = new B();
        tab[2] = new C();
        tab[1].b = 2;       // Erreur : b n'est pas un attribut de A
        ((C)tab[2]).c = 3;  // Erreur : c est final
    }
}

abstract class A {
    int a;
}

class B extends A {
    int b;
}

final class C extends A {
    final double c = 1;
}

abstract class D extends A {
    double d;
    int operation(int a) {
        return (a * 2);
    }
    abstract int calcul(int b) {   // Erreur : méthode abstraite dans une classe non abstraite 
    }
    abstract int machin();
}