package Jour07.Job05.Job05p2;

public class ABCDEF {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        // b = a;      // Error: incompatible types: A cannot be converted to B
        a = (A) b;
        a = null;
        // null = a;   // Error: unexpected type
        a = d;
        // b = d;      // Error: incompatible types: D cannot be converted to B
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();
        
        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        int somme = 0;
        for (A a : as) {
            if (a instanceof B) {
                System.out.println("B trouvé");
                somme += 1;
            }
        }
        System.out.println("Somme de B : " + somme);
    }

    private static void additionner(A[] as) {
        int somme = 0;
        for (A a : as) {
            if (a instanceof D) {
                somme += ((D) a).d;
            }
        }
        System.out.println("Somme: " + somme);
    }
}

class A {
    public A() {}
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C() {
        super();
    }
}

class D extends A {
    protected int d = 1;

    public D(int x) {
        super();
        d = x;
    }

    public D() {
    }
}

class E extends D {
    public E() {
    }
}

class F extends E {
    public F() {
        super();
    }
}