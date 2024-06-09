import java.util.Scanner;

public class GoldenRatio {
	final static double gRatio = 1.618;
	public static void main(String[] args) {
		// TODO
		double num1 = 0;
		double num2 = 0;
		double ratio1 = 0;
		double ratio2 = 0;

		System.out.print("Enter two numbers: ");
		Scanner scan = new Scanner(System.in);

		if(scan.hasNextDouble()){
			num1 = scan.nextDouble();
		} else {
			System.out.println();
			System.out.println("Invalid input.");
			System.exit(0);
		}

		if(scan.hasNextDouble()){
			num2 = scan.nextDouble();
		} else {
			System.out.println();
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		ratio1 = (num1 + num2)/num1;
		ratio2 = (num1 + num2)/num2;

		ratio1 = Math.round(ratio1*1000)/1000.0;
		ratio2 = Math.round(ratio2*1000)/1000.0;
		
		if (ratio1==gRatio || ratio2==gRatio){
			System.out.println();
			System.out.println("Golden ratio!");
		} else {
			System.out.println();
			System.out.println("Maybe next time.");
		}
		

	}
}
