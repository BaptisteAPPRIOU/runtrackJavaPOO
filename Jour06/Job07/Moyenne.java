package Jour06.Job07;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double moyenne = 0.0;
        System.out.print("Enter the first number: ");
        double number = scanner.nextDouble();
        moyenne += number;
        System.out.print("Enter the second number: ");
        number = scanner.nextDouble();
        moyenne += number;
        System.out.print("Enter the third number: ");
        number = scanner.nextDouble();
        moyenne += number;
        System.out.print("Enter the fourth number: ");
        number = scanner.nextDouble();
        moyenne += number;
        System.out.print("Enter the fifth number: ");
        number = scanner.nextDouble();
        moyenne += number;
        System.out.println("The average is " + moyenne / 5);
        scanner.close();
    }
}
