package Jour06.Job13;

import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
