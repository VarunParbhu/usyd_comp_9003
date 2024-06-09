// your code here
import java.util.Scanner;

public class OddEven{
    public static void main(String[]args){
        int number =0;
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){
            number = scan.nextInt();
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        if (number%2==0){
            System.out.printf("The number %d is even.",number);
            System.out.println();
        } else {
            System.out.printf("The number %d is odd.",number);
            System.out.println();
        }

    }
}
