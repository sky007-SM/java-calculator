import java.util.Scanner;

public class Calculator {
    // Constant for exit condition using final keyword 
    private static final String EXIT ="n";
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        String choice = "y";
        // equalsIgnoreCase to check condition and ignore case of the string
        while(!choice.equalsIgnoreCase(EXIT)){
            System.out.println();
            showMenu(scan); // Function that Displays Menu with scanner object as argument
            System.out.println();
            System.out.print("Do you want to Continue (y/n): ");
            choice = scan.next();  // Updates Choice
        }
        scan.close();
    }

    static void showMenu(Scanner scan){

        // Function that Displays Menu
        System.out.println("===== CALCULATOR =====");
        System.out.println(); // System.out.println() provides a new line after the text 

        System.out.println();
        System.out.println("1. Addition : +");
        System.out.println("2. Subtraction : -");
        System.out.println("3. Multiplication : *");
        System.out.println("4. Division : /");

        System.out.println();
        System.out.print("Choose Operation (+, -, *, /): ");
        String operation = scan.next();
        System.out.print("Enter first number: ");
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number:"); // Handles invalid input
            scan.next();
        }
        
        double value1 = scan.nextDouble(); // double type used for larger decimal number 
        System.out.println();
        System.out.print("Enter second number: ");
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number:");
            scan.next();
        }
        
        double value2 = scan.nextDouble();
        System.out.println();
        calculate(operation, value1, value2); // Function that calculates answer

    }
    static void calculate(String operation, double value1, double value2){
        // Switch Conditional Statements
        switch(operation){
            case "+":
                System.out.printf("Result: %.2f%n", add(value1, value2)); // printf is used for formatted output
                break;
            case "-":
                System.out.printf("Result: %.2f%n", subtract(value1, value2));
                break;
            case "*":
                System.out.printf("Result: %.2f%n", multiply(value1, value2));
                break;
            case "/":
                if(value2 == 0){
                    System.out.println("Error: Division by Zero"); // Handles Division by Zero
                    break;
                }
                System.out.printf("Result: %.2f%n", divide(value1, value2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
    // Methods to perform different operations
    static double add(double value1, double value2){
        return value1 + value2;

    }
    static double subtract(double value1, double value2){
        return value1 - value2;

    }
    static double multiply(double value1, double value2){
        return value1 * value2;

    }
    static double divide(double value1, double value2){
        return value1 / value2;  

    }

}

