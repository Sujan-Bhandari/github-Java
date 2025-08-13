import java.util.Scanner;

public class Atmmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pin = 1234; // predefined PIN
        double balance = 1000.0; // starting balance
        int tries = 0;

        // Step 1: PIN Verification
        while (tries < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                System.out.println("PIN correct. Welcome to the ATM!");

                // Step 2: ATM Menu
                boolean exit = false;
                while (!exit) {
                    System.out.println("\n--- ATM MENU ---");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Deposit Money");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();

                    double amount; // declare here so it works for both withdraw and deposit

                    if (choice == 1) {
                        System.out.printf("Your balance: $%.2f%n", balance);
                    }
                    else if (choice == 2) {
                        System.out.print("Enter withdrawal amount: $");
                        amount = scanner.nextDouble();
                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.printf("Withdrawal successful. Remaining balance: $%.2f%n", balance);
                        } else {
                            System.out.println("Invalid amount or insufficient funds.");
                        }
                    }
                    else if (choice == 3) {
                        System.out.print("Enter deposit amount: $");
                        amount = scanner.nextDouble();
                        if (amount > 0) {
                            balance += amount;
                            System.out.printf("Deposit successful. New balance: $%.2f%n", balance);
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                    }
                    else if (choice == 4) {
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        exit = true;
                    }
                    else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
                break; // Exit after successful PIN and transactions
            }
            else {
                tries++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - tries));
            }
        }

        if (tries == 3) {
            System.out.println("Too many incorrect attempts. Your card is blocked.");
        }

        scanner.close();
    }
}

