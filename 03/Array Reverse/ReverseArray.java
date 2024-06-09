import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReverseArray {
	
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		File I = new File(args[0]);

		try{
			Scanner scan = new Scanner(I);
			String input = scan.nextLine();
			String[] inputArray =  input.split(" ");

			for(String in : inputArray){
				data.add(in);
			}
			scan.close();

			File O = new File(args[1]);

			PrintWriter writer = new PrintWriter(O);
			for(int i=data.size()-1;i>=0;i--){
				if(i!=0){
					writer.print(data.get(i));
					writer.print(" ");
				} else {
					writer.print(data.get(i));
				}
				
			}
			writer.println("");
			writer.close();
			System.out.println();
		} catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
	}
}
