import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double add(double x, double y) {
        return x + y;
    }

    // Method to subtract two numbers
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Method to multiply two numbers
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method to divide two numbers with zero checking
    public static String divide(double x, double y) {
        if (y == 0) {
            return "Error: Division by Zero";
        } else {
            return String.valueOf(x / y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.in);
        System.out.println("---------------------------------");
        System.out.println("    WELCOME TO MY CALCULATOR     ");
        System.out.println("---------------------------------");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.println("5. Exit");
        System.out.println("---------------------------------");

        while (true) {
            System.out.print("Enter your choice (1-5): ");
            String choice = scanner.next();

            if (choice.equals("5")) {
                System.out.println("Thank you for using the calculator! Goodbye.");
                break;
            }

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                try {
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    if (choice.equals("1")) {
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + add(num1, num2));
                    } else if (choice.equals("2")) {
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                    } else if (choice.equals("3")) {
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                    } else if (choice.equals("4")) {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                } catch (Exception e) {
                    System.out.println("Oops! That's not a valid number. Please try again.\n");
                    scanner.next(); // Clear invalid input
                    continue;
                }
                System.out.println("---------------------------------");
            } else {
                System.out.println("Invalid Option! Please enter a number between 1 and 5.\n");
            }
        }
        scanner.close();
    }
}
