import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        int English, Math, Science, Social, Computer;
        double percentage;
        int total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your marks in English: ");
        English = scanner.nextInt();
        System.out.print("Enter your marks in Math: ");
        Math = scanner.nextInt();
        System.out.print("Enter your marks in Science: ");
        Science = scanner.nextInt();
        System.out.print("Enter your marks in Social: ");
        Social = scanner.nextInt();
        System.out.print("Enter your marks in Computer: ");
        Computer = scanner.nextInt();

        total = English + Math + Science + Social + Computer;
        percentage = (total / 500.0) * 100;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Distinction");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 60) {
            System.out.println("First Division");
            System.out.println("Remarks: Good");
        } else if (percentage >= 50) {
            System.out.println("Second Division");
            System.out.println("Remarks: Fair");
        } else {
            System.out.println("Third Division");
            System.out.println("Remarks: Work harder");
        }

        scanner.close();
    }
}
