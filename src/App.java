import java.util.Scanner;// this is just importing scanner. it helps with taking user input for example, if a user wants to put anything in the terminal it just tracks it.
////////////////////////////////
public class App { //basic java BS^
    public static void main(String[] args) { //more basic java BS^
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
        //this is the scanner we imported and using it to take user input.
        boolean continueCalculating = true; // Boolean flag to control the loop
        //this is a boolean variable that will continue the loop until the user decides to stop, you have to put this first because we have continue calculating if the user wants to.

        while (continueCalculating) {
            // so while we are continueCalculating is true, the loop will continue.
            System.out.println("Simple Calculator"); // Print the title of the calculator - user has to know what the application is
            System.out.print("Enter first number: "); // Print the first number input prompt 
            double num1 = scanner.nextDouble(); // First number input by the user

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0); // Operator input by the user

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble(); // Second number input by the user

            double result; // Variable to store the result of the calculation

            switch (operator) {
                case '+':
                    result = add(num1, num2); // Call add method
                    break;
                case '-':
                    result = subtract(num1, num2); // Call subtract method
                    break;
                case '*':
                    result = multiply(num1, num2); // Call multiply method
                    break;
                case '/':
                    result = divide(num1, num2); // Call divide method
                    break;
                default:
                    System.out.println("User error...please enter a valid operator (+, -, *, /) for the calculation.");
                    continue; // Skip the rest of the loop and prompt again
            }

            System.out.println("The result is: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userResponse = scanner.next(); // User response to continue or not
            if (!userResponse.equalsIgnoreCase("yes")) {
                continueCalculating = false; // Set flag to false to exit loop
            }
        }

        scanner.close(); // Close the scanner
        System.out.println("Exiting the calculator. Goodbye!");
    }

    public static double add(double a, double b) { // Method to add two numbers
        return a + b;
    }

    public static double subtract(double a, double b) { // Method to subtract two numbers
        return a - b;
    }

    public static double multiply(double a, double b) { // Method to multiply two numbers
        return a * b;
    }

    public static double divide(double a, double b) { // Method to divide two numbers
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return a / b;
    }
}