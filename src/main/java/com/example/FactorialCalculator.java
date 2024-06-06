package com.example;
import java.util.Scanner;

public class FactorialCalculator {
    public void calculateFactorialInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            long factorial;
            while (true) {
                try {
                    System.out.print("Please enter a number to calculate its factorial (or type 'exit' to terminate): ");
                    if (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                        if (number < 0) {
                            System.out.println("Error: The factorial of a negative number is not defined. Please enter a non-negative number.");
                        } else {
                            factorial = calculateFactorial(number);
                            System.out.println("The factorial of " + number + " is " + factorial);
                        }
                    } else {
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter an integer or type 'exit' to quit.");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // consumes the invalid input to prevent an infinite loop
                }
            }
        }
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
