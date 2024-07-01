package Jour06.Job05;

import java.util.Scanner;

public class Carre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The square of " + number + " is " + number * number);
        scanner.close();
    }
}
