import java.util.Scanner;


public class countDown {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the count down:");
        int start=sc.nextInt();

        for(int i=start; i>=0; i--){
            System.out.println( i );
            try{
                Thread.sleep(1000);//1second

            }
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }

        }

        System.out.println(" Happy New Year!!!");





    }
}
