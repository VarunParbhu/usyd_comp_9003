// your code here
import java.util.Scanner;

public class Greet{
    public static void main (String[] args){
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
