public class CountDuplicates {
	
	
	
	public static int countDuplicates(int[] a) {
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
	
	public static void main(String[] args) {
		int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
		int result = countDuplicates(dups); 
		System.out.println(result);
	}
	
}
