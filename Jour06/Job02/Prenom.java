package Jour06.Job02;

import java.util.Scanner;

public class Prenom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String prenom = scanner.nextLine();
        System.out.println("Hello " + prenom + "!");
        scanner.close();
    }
}
