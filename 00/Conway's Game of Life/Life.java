import java.util.Scanner;

public class Life {
	
	static final char DEAD_SYMBOL = '.';
	static final char LIFE_SYMBOL = 'O';
	
	int width;
	int height;
	boolean[][] lifeField;
	
	public Life(int width, int height) {
		this.width = width;
		this.height = height;
		// initialise all cells as dead
		this.lifeField = new boolean[height][width];
	}
	
	public void nextGeneration() {
		boolean[][] nextGen = new boolean[this.height][this.width];
		// TODO: calculate next generation
		
		
		
		
		this.lifeField = nextGen;
	}
	
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		/**
		 * First line of input is width height generations
		 * No error handling is required cause I'm lazy
		 **/
		String[] params = stdin.nextLine().split(" ");
		int width = Integer.parseInt(params[0]);
		int height = Integer.parseInt(params[1]);
		int generations = Integer.parseInt(params[2]);
		
		Life game = new Life(width, height);
		for (int i = 0; i < height; ++i) {
			game.setRow(i, stdin.nextLine());
		}
		stdin.close();
		
		for (int i = 0; i < generations; ++i) {
			game.nextGeneration();
			System.out.println(game.toString());
		}
	}
	
	public void setRow(int rowNum, String rowState) {
		for (int i = 0; i < this.width; ++i) {
			boolean isAlive;
			switch (rowState.charAt(i)) {
				case DEAD_SYMBOL:
					isAlive = false;
					break;
				case LIFE_SYMBOL:
					isAlive = true;
					break;
				default:
					throw new IllegalArgumentException("Unrecognised symbol");
			}
			this.lifeField[rowNum][i] = isAlive;
		}
	}
	
	public String toString() {
		StringBuilder out = new StringBuilder((this.width + 1) * this.height);
		for (int y = 0; y < this.height; ++y) {
			boolean[] row = lifeField[y];
			for (int x = 0; x < this.width; ++x) {
				if (row[x]) // is alive
					out.append(LIFE_SYMBOL);
				else
					out.append(DEAD_SYMBOL);
			}
			out.append('\n');	
		}
		return out.toString();
	}
}
