import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Scissors{
    public static void main (String [] args){
        int delimeter = Integer.parseInt(args[0]);
        
         try{
            File f = new File(args[1]);
            Scanner scan = new Scanner(f);
    
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine().split(" ")[delimeter-1].toString());
                }  
            } catch (Exception e) {
                System.out.println(e);
            }
        
    }

}
