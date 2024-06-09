import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolve {

	public static boolean isSolvableBoolean;
	public static List<String> integerChoice = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
	public static Integer[] integerChoiceINT = {1,2,3,4,5,6,7,8,9};

	public static boolean contains(Integer[] a, Integer element) {
		boolean contain = false;
		if(a==null){
			return contain;
		}

		for (int i=0;i<a.length;i++){
			if (a[i]==element){
				contain = true;
			}
		}
		return contain;
	}
	

	public static Integer countDuplicates(Integer[] a) {
		if (a==null){
			return 0;
		}
		int counter =0;
		int check = 0;

		for (int i=0;i<a.length;i++){
			check =0;
			for (int j=0;j<i;j++){
				if (a[i]==a[j]){
					check++;
				}
			}
			if (check==1){
				counter++;
			}
		}
		return counter;
	}

	public static boolean areInputValid(Integer[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(contains(integerChoiceINT,board[i][j])==false){
					return false;
				}

			}
		}
		return true;
	}

	public static boolean areRowsValid(Integer[][] board){
		int count = 0;
		for(int i=0;i<board.length;i++){
			count = countDuplicates(board[i]);
			if(count>0){
				// System.out.println(count);
				return false;
			}
		}
		return true;
	}

	public static boolean areColsValid(Integer[][] board){
		int count = 0;
		for (int j=0;j<board[0].length;j++){
			Integer[] col = new Integer[board.length];
			for (int i=0;i<board.length;i++){
				col[i] = board[i][j];
			}
			count = countDuplicates(col);
			if(count>0){
				// System.out.println(count);
				return false;
			}
		}
		return true;
	}

	public static boolean areSquresValid(Integer[][] board){
		ArrayList<Integer> grid = new ArrayList<>();
		int numRow = board.length/3;
		int numCol = board[0].length/3;
		// System.out.println(numRow);
		// System.out.println(numCol);

		for(int r = 0; r<numRow;r=r+3){
			for(int c=0; c<numCol;c=c+3){
				int count = 0;
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						// System.out.println(r + " " + i + " " + c + " " + j);
						grid.add(board[r+i][c+j]);
					}
				}
				Integer[] gridArray = grid.toArray(new Integer[grid.size()]);
				count = countDuplicates(gridArray);	
				if(count>0){
					// System.out.println(count);
					return false;
				}
				// System.out.println(grid.toString());
			}
		}
		return true;
	}

	public static boolean isPermutationValid(Integer[][] board, String permutation){
		Integer permutationCounter =0;
		Integer[][] completeBoard = new Integer[board.length][board[0].length];
		for(int i =0; i<board.length;i++){
			for(int j=0; j<board[i].length;j++){
				if(board[i][j]==null){
					completeBoard[i][j] = permutation.charAt(permutationCounter++)-'0';
				} else {
					completeBoard[i][j] = board[i][j];
				}
			}
		}

		// for (int i = 0; i < completeBoard.length; i++) {
        //     for (int j = 0; j < completeBoard[i].length; j++) {
        //         System.out.print(completeBoard[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line after printing each row
        // }
		// System.out.println();



		if(areColsValid(completeBoard) && areRowsValid(completeBoard) && areSquresValid(completeBoard)){
			// System.out.println(areColsValid(completeBoard) && areRowsValid(completeBoard) && areSquresValid(completeBoard));
			return true;
		} else {
			return false;
		}
	}

	public static void generatePermutationsAndTest(List<String> combination, int length, String current,Integer[][] board) {
		// if(isSolvableBoolean==true){
		// 	return;
		// }

        if (current.length() == length) {
			System.out.println(current);
			if(isPermutationValid(board,current)){
				isSolvableBoolean = true;
				return;
			} else {
				return;
			}
		}
		for (String item : combination) {
			if(isSolvableBoolean){
				return;
			} else {
				generatePermutationsAndTest(combination, length, current + item, board);
			}
        }
	}

	public static boolean isSolvable(Integer[][] board) {
		
	// 	for (int i = 0; i < board.length; i++) {
	// 		for (int j = 0; j < board[i].length; j++) {
	// 			System.out.print(board[i][j] + " ");
	// 		}
	// 			System.out.println(); // Move to the next line after printing each row
	// 		}
	// 			System.out.println();


		// Check the number of null currently in the board
		Integer nullCount = 0;
		for(int i=0;i<board.length;i++){
			for (int j=0;j<board[i].length;j++){
				if(board[i][j]==null){
					nullCount++;
				}
			}
		}

		// if(nullCount==board.length*board[0].length){
		// 	return false;
		// }


		// Generate a solution and check if it solves the board, stop when one is true
		if(nullCount>0){
			generatePermutationsAndTest(integerChoice, nullCount, "", board);
		} else {
			if(!(areColsValid(board) && areRowsValid(board) && areSquresValid(board) && areInputValid(board))){
				return false;
				} else {
					return true;
				}
		}		
		//return false;
        return isSolvableBoolean;
    }
	
	public static void main(String[] args) {
		//Write some tests if you want check here or change b
		// Integer[][] b = { 
		// 		{ 1,  1,  3},
		// 		{ 5,  7,  8},
		// 		{ 2,  null,  null},
		// 	};


		Integer[][] b = { 
				{5,3,6,8,2,7,9,4,1},
				{1,7,2,9,6,4,3,5,8},
				{8,9,4,1,5,3,2,6,7},
				{7,1,5,3,4,9,8,2,6},
				{6,4,3,7,8,2,1,9,5},
				{9,2,8,5,1,6,7,3,4},
				{4,8,1,2,9,5,6,7,3},
				{3,6,9,4,7,1,5,8,2},
				{2,5,7,6,3,8,4,1,9}
			};
		
		// Integer[][] b = { 
		// 		{5,3,6,8,2,7,9,4,1},
		// 		{1,7,2,9,6,4,3,5,8},
		// 		{8,9,4,1,5,3,2,6,7},
		// 		{7,1,5,3,4,9,8,2,6},
		// 		{6,4,3,7,8,2,1,9,5},
		// 		{9,2,8,5,1,null,7,3,4},
		// 		{4,8,1,2,9,5,6,7,3},
		// 		{3,6,9,4,7,1,5,8,2},
		// 		{2,5,7,null,3,8,4,1,9}
		// 	};

		System.out.println(isSolvable(b));
	}
}
