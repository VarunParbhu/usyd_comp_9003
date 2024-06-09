import java.util.Scanner;

public class Occurrence {
	
	public static void main(String[] args) {
		//YOUR CODE HERE
		String input;
		int[] count = new int[10];

		// System.out.print("Insert numbers: ");
		Scanner scan = new Scanner(System.in);

		input = scan.next();

		for(int i=0;i<input.length();i++){
			for(int j=0;j<10;j++){
				// System.out.println(j);
				// System.out.println(Character.getNumericValue(input.charAt(i)));
				if(j==Character.getNumericValue(input.charAt(i))){
					count[j]+=1;
				}
			}
		}
		for(int k=0;k<10;k++){
			System.out.printf("%d: %d",k,count[k]);
			System.out.println();
		}	

	}
	
}
