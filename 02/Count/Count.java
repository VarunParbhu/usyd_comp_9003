public class Count {
	
	public static int count(int[] array, int element) {
		if (array==null){
			return 0;
		}
		int counter =0;
		for (int i=0;i<array.length;i++){
			if (element==array[i]){
				counter +=1;
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
		int result = count(array, 1); //3
		System.out.println(result);
		
		
	}
	
}
