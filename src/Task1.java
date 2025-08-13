
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);

        String item;
        double price;
        int many;
        double total;

        System.out.println("What item would you like to buy? :");
        item = scanner.nextLine();
        System.out.println("What is the price for each? : " );
         price=scanner.nextDouble();
        System.out.println("How many would you like? :");
        many=scanner.nextInt();


        total = price*many;

        System.out.println("you have bought"+price+ "" +item+ " pizza/s");
        System.out.println("your total is :$" + total+ " ");




        scanner.close();
    }
}
