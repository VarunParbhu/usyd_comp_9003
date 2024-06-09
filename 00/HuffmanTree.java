import java.util.Scanner;

class HuffmanTree {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter message: ");
		String message = stdin.nextLine();
		System.out.println();
		stdin.close();
		
		// TODO:
		// 1. calculate frequency of each character
		// 2. pair two character with lowest frequency to form a tree
		// 3. repeat untill only one node remains
		// 4. extract code from tree structure
		// 5. encode message using code book
	}
}

// Maybe some sort of node class
