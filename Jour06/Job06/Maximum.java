package Jour06.Job06;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        System.out.println("The maximum of " + number1 + ", " + number2 + " and " + number3 + " is " + Math.max(Math.max(number1, number2), number3));
        scanner.close();
    }
}
