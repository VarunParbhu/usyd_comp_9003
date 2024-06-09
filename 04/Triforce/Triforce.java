import java.util.Scanner;

public class Triforce {
	public static int height;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter height: ");

		
		if(scan.hasNextInt()){
			height = scan.nextInt();
		} else {
			System.out.println();
			System.out.println("Invalid height.");
			System.exit(0);
		}

		if (height<2 || height >20){
			System.out.println();
			System.out.println("Invalid height.");
			System.exit(0);
		}

		System.out.println();

		for (int i=0;i<height*2;i++){
			if(i<height){
				if(i==height-1){
					System.out.printf(" ".repeat((2*height-1-i))+ "/" + "_".repeat(2*height-2) + "\\");
				} else {
				System.out.printf(" ".repeat((2*height-1-i))+ "/" + " ".repeat(i*2) + "\\");
				}
				System.out.println();
			} else {
				if(i==height*2-1){
					System.out.printf(" ".repeat((2*height-1-i))+ "/" + "_".repeat(2*height-2) + "\\");
					System.out.printf(" ".repeat((2*height-1-i))+ "/" + "_".repeat(2*height-2) + "\\");
				} else {
					System.out.printf(" ".repeat((2*height-1-i))+ "/" + " ".repeat(i%height * 2) + "\\");
					System.out.printf(" ".repeat(2*(2*height-1-i))+ "/" + " ".repeat(i%height * 2) + "\\");
				}
				System.out.println();
			}


		}
	}
}
