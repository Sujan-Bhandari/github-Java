import java.util.Scanner;


public class Task2 {
    public static void main(String[] ars ){

    int age;
    String name;
    boolean forVote;

    Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your name:  ");
        name =scanner.nextLine();
        System.out.println("Enter your age please ");
        age=scanner.nextInt();

        forVote = (age >= 18);

        if (forVote){
            System.out.println(" You are eligible to vote♥");

        }
        else {
            System.out.println(" You are not eligible to vote☺");
        }

        // for full sentence to right again
        if(forVote){
            System.out.println( " Your name is " + name + " and your "+ age + " and  you are eligible  to vote♥");

        }
        else {

        System.out.println( " Your name is " + name + "and your "+ age + " and  you are not eligible to vote☺");
        }


        scanner.close();
    }

}
