package com.gloriane;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // get input
            System.out.println("===== Welcome to My Calculator App =====");

            System.out.println("Select operation (+, -, *, /, sqrt, square, cube, %, percent):");
            String operation = scanner.next();

            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            double result = num1;

            // Check if operation needs only one number (no loop needed)
            if (operation.equals("sqrt") || operation.equals("square") || operation.equals("cube")) {
                try {
                    switch (operation) {
                        case "sqrt":
                            if (result < 0) {
                                throw new IllegalArgumentException("Cannot calculate square root of negative number");
                            }
                            result = Math.sqrt(result);
                            break;

                        case "square":
                            result = result * result;
                            break;

                        case "cube":
                            result = result * result * result;
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    continue;
                }
            } else {
                // Operations that need multiple numbers - use the loop
                while (true) {
                    System.out.println("Do you want to add another number? (y/n):");
                    char addMore = scanner.next().charAt(0);

                    if (addMore != 'y' && addMore != 'Y') {
                        break; // Exit the inner loop when user says no
                    }

                    System.out.println("Enter next number:");
                    double nextNum = scanner.nextDouble();

                    try { // Start try block for operations that might throw exceptions
                        switch (operation) {
                            case "+":
                                result += nextNum;
                                break;
                            case "-":
                                result -= nextNum;
                                break;
                            case "*":
                                result *= nextNum;
                                break;
                            case "/":
                                if (nextNum == 0) {
                                    throw new IllegalArgumentException("Division by zero is not allowed");
                                }
                                result /= nextNum;
                                break;
                            case "%":
                                if (nextNum == 0) {
                                    throw new IllegalArgumentException("Modulo by zero is not allowed");
                                }
                                result = result % nextNum;
                                break;
                            case "percent":
                                result = (result * nextNum) / 100;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid operation: " + operation);
                        }
                        System.out.println("Current result is: " + result);
                    } catch (IllegalArgumentException e) { // Catch block matches the try block above
                        System.out.println("Error: " + e.getMessage());
                        continue; // Go back to ask for another number
                    } // End of try-catch block
                } // End of while loop for multiple numbers
            } // End of else block for multi-number operations

            System.out.println("Final result is: " + result);

            // ask to continue
            System.out.println("Do you want to perform another calculation? (y/n):");
            char again = scanner.next().charAt(0);
            if (again == 'y' || again == 'Y') {
                // continue loop
            } else {
                System.out.println("Thank you for using the calculator!");
                break;
            }
        }
        scanner.close();
    }
}