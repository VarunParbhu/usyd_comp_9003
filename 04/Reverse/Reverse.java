import java.util.Scanner;
import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		while(scan.hasNextLine()){
			input.add(scan.nextLine());
		}

		for(int i=0;i<input.size();i++){
			String text = input.get(i);
			for(int j=text.length()-1;j>=0;j--){
				System.out.print(text.charAt(j));
			}
			System.out.println();
		}
	}
}
