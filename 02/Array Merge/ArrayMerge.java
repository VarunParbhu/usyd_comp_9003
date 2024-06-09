public class ArrayMerge{
	public static int[][] mergeArrays(int[][] arrayA, int[][] arrayB){
		int[][] output = new int[arrayA.length][arrayA[0].length + arrayB[0].length];

		for(int i =0;i<arrayA.length;i++){
			for (int j=0;j<arrayA[0].length + arrayB[0].length;j++){
				if (j>=arrayA[0].length){
					output[i][j]=arrayB[i][j-arrayA[0].length];
				} else {
				output[i][j]=arrayA[i][j];
				}
			}
		}
		
		return output;
	}

	public static void main(String[] args){
		int[][] arrayA = {{1, 2, 3, 3},{3, 2, 1, 6},{4, 5, 6, 1}};
		int[][] arrayB = {{1, 9, 7, 2, 3},{0, 7, 8, 3, 2},{3, 8, 9, 7, 2}};
		int[][] merge = mergeArrays(arrayA,arrayB);

		for (int a=0;a<merge.length;a++){
			for (int b=0; b<merge[0].length;b++){
				System.out.printf(merge[a][b] + " ");
			}
			System.out.println();
		}

	}
}
