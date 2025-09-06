import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String [] args){

        //Enhanced Switch= a replacement to many else if Statement
        Scanner scanner=new Scanner(System.in);

        String day;

        System.out.println("Enter the day you like : ");
        day=scanner.nextLine();

        switch (day){

            case "Monday","Tuesday","Wednesday","Thusday","Friday" -> System.out.println("This is your Work Day. Enjoy your Work♥");

            case "Saturday", "Sunday" -> System.out.println("This is your Off Day. Enjoy your Weekend☺");

            default -> System.out.println("Enter the correct day");
        }
        scanner.close();
    }
}
