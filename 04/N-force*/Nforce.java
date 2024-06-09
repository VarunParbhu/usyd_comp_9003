import java.util.Scanner;

public class Nforce {
	public static int height;
	public static int rows;
	public static int index;

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

		if (height<1 || height >20){
			System.out.println();
			System.out.println("Invalid height.");
			System.exit(0);
		}

		System.out.print("Enter number of rows: ");

		if(scan.hasNextInt()){
			rows = scan.nextInt();
		} else {
			System.out.println();
			System.out.println("Invalid number of rows.");
			System.exit(0);
		}

		if (rows<1 || rows >20){
			System.out.println();
			System.out.println("Invalid number of rows.");
			System.exit(0);
		}

		System.out.println();

		for(int r=0;r<rows;r++){
			for(int h=0;h<height;h++){

				if((index+1)%height==0 && index>0){
					for (int c=0;c<r+1;c++){
						if(c==0){
							System.out.print(" ".repeat(rows*height-1-index) + "/" + "_".repeat(2*height-2)+ "\\");
						} else {
							System.out.print("/" + "_".repeat(2*height-2)+ "\\");
						}
					}
					System.out.println();
				} else {
					for (int c=0;c<r+1;c++)
						if (c==0){
							System.out.print(" ".repeat(rows*height-1-index) + "/" + " ".repeat(2*h)+"\\");
						} else {
							System.out.print(" ".repeat(2*(height-h-1)) + "/" + " ".repeat(2*h)+"\\");
						}
					System.out.println();
				}
				index++;
			}
		
		}
	
	}
}
