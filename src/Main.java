import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age ");
        int age= scanner.nextInt();

        System.out.println("Enter your gpe ");
        double gpa=scanner.nextDouble();

        System.out.println(" Are you a student? (True/False)");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+age);
        System.out.println("Your gpa is "+gpa);

        if(isStudent){
            System.out.println("You are a Student");

        }
        else{
            System.out.println("You are NOT a Student");
        }


        scanner.close();
    }
}

