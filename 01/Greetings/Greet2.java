import java.util.Scanner;

public class Greet2{
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.printf("Hello, %s!",name);
        System.out.println();
    }
}
