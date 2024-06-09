import java.util.Scanner;
public class Binary {
	private static boolean isBin = true;
	private static int sum;
	private static int powerOf2=1;

	// Returns decimal representation of given binary number.
	public static int toDecimal(String b) {
		for(int i=b.length()-1;i>=0;i--){
			if(b.charAt(i)=='1'){
				sum += powerOf2;
			}
			powerOf2 = powerOf2*2;
		}
		return sum;

	}

	// Returns whether or not given string is a binary number.
	public static boolean isBinary(String b) {
		for(int i=0;i<b.length();i++){
			if(!(b.charAt(i)=='1' || b.charAt(i)=='0')){
				isBin=false;
			}
		}
		 return isBin;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter binary: ");
		String input = scan.next();
		System.out.println();

		boolean isBin = isBinary(input);

		if(!isBin){
			System.out.println("Not binary!");
		} else {
			int bin = toDecimal(input);
			System.out.println(bin + " in decimal");
		}

	}
}
