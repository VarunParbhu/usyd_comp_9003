import java.util.Arrays;

public class ArrayUnion {
	//count
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

	//contains
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
	
	//countDuplicates
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
	
	public static int[] union(int[] a, int[] b) {
		if (a==null || b==null){
			return null;
		}

		int[] merge = new int[a.length + b.length];

		for (int i=0;i<a.length;i++){
			merge[i] = a[i];
		}
		for (int i=0;i<b.length;i++){
			merge[i + a.length] = b[i];
		}

		int dup_length = countDuplicates(merge);
		int[] dups = new int[dup_length];
		int[] dups_counter = new int[dup_length];

		int dup_cnt =0;
		for (int i=0;i<merge.length;i++){
			int counter = count(merge,merge[i]);
			if (counter>1 && contains(dups,merge[i])==false){
				dups[dup_cnt] = merge[i];
				dups_counter[dup_cnt] = counter;
				dup_cnt++;
			}
		}

		int total_dups=0;
		for (int i=0;i<dups_counter.length;i++){
			total_dups += dups_counter[i];
		}
		
		int[] output = new int[merge.length + dups_counter.length - total_dups];
		int k = 0;
		for (int i=0;i<merge.length;i++){
			if(contains(output,merge[i])==false){
				output[k]=merge[i];
				k++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		int[] x = {3, 2, 7};
		int[] y = {3, 8, 9};
		int[] result = union(x, y);
		System.out.println(Arrays.toString(result));	
	}	
}
