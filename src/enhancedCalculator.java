import java.util.Scanner;

public class enhancedCalculator {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);

        // Take numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Show menu
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Enhanced switch
        double result = switch (choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 != 0) {
                    yield num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    yield 0;
                }
            }
            default -> {
                System.out.println("Invalid choice!");
                yield 0;
            }
        };

        System.out.println("Result: " + result);

        scanner.close();
    }
}