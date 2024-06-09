public class Contains {
	
	public static boolean contains(int[] a, int element) {
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
	
	public static void main(String[] args) {
		int[] array = {1, 1, 5, 5, 5, 3, 8, 1};
		boolean result = contains(array, 5);
		System.out.println(result);
	}
	
	
}
