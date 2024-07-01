package Jour06.Job04;

import java.util.Scanner;

public class Bienvenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String prenom = scanner.nextLine();
        System.out.println("Welcome " + prenom + "!");
        scanner.close();
    }
}
