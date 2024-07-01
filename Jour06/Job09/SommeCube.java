package Jour06.Job09;

import java.util.Scanner;

public class SommeCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        System.out.println("Sum of the first " + n + " cubes: " + sum);
        scanner.close();
    }
}
