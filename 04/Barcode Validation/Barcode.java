import java.util.Scanner;

public class Barcode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		int oddSum = 0;
		int evenSum = 0;
		int checkDigit = Character.getNumericValue(input.charAt(input.length()-1));
		boolean isValid;

		for(int i=0;i<input.length()-1;i++){
			int charInt = Character.getNumericValue(input.charAt(i));
			if((i+1)%2==0){
				evenSum += charInt;
			} else {
				oddSum += charInt;
			}
		}


		if(checkDigit==(10-(oddSum*3)%10-(evenSum%10))%10){
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
