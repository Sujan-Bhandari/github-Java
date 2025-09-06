import java.util.Scanner;



public class CorFconvert {
    public static  void main(String[] args){
        double temp;
        double newTemp;
       String unit;


        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        temp =scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit =scanner.next().toUpperCase();

        //condition ? true : false ;

        newTemp=(unit.equals("C"))? (temp -32)*5/9 : (temp*5/9)+32 ;

        System.out.printf("%.1f %s%n", newTemp, unit);

        scanner.close();
    }
}
