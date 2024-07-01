package Jour06.Job11;

public class Fact8 {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 8; i++) {
            fact *= i;
        }
        System.out.println("La factorielle de 8 est " + fact);
    }
}
