import java.math.BigDecimal;
import java.math.RoundingMode;
/* 
 *	Generate a sequence of numbers using the modulus operation
 *
 *	Each method returns an array of n numbers
 *	if n < 0 return null
 *  if n == 0 return array of size zero
 */
public class Modmad
{
	// practice (no modulus needed)
	// Sequence: 13, 13, 13, 13, 13, 13, ...
	public static int[] practice1(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]=13;
		}
		return array;
	}	
	
	// practice (no modulus needed)
	// Sequence: 0, 1, 2, 3, 4, 5, 6, 7...
	public static int[] practice2(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]=i;
		}
		return array;
	}

	// Sequence: 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3...
	public static int[] generateA(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]=i%4;
		}
		return array;
	}

	// Sequence: 3, 2, 1, 0, 3, 2, 1, 0, 3, 2, 1, 0...
	public static int[] generateB(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]=3-i%4;
		}
		return array;
	}

	// Sequence: 0, 3, 6, 0, 3, 6, 0, 3, 6...
	public static int[] generateC(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= (i%3) * 3;
		}
		return array;
	}

	// Sequence: 0, 2, 4, 6, 0, 2, 4, 6, 0, 2, 4, 6...
	public static int[] generateD(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= (i%4) * 2;
		}
		return array;
	}

	// Sequence: -3, -2, -1, 0, 1, 2, 3, -3, -2, -1, 0, 1, 2, 3...
	public static int[] generateE(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= (i%7) - 3;
		}
		return array;
	}

	// Sequence: 100, 105, 110, 115, 120, 100, 105, 110, 115, 120, 100...
	public static int[] generateF(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= 5*(i%5) + 100;
		}
		return array;
	}
	
	// Sequence: -1, 1, 3, 5, -1, 1, 3, 5, -1, 1, 3, 5...
	public static int[] generateG(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= 2*(i%4) - 1;
		}
		return array;
	}
	
	// Sequence: 0, 50, 100, 0, 50, 100...
	public static int[] generateH(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= 50*(i%3);
		}
		return array;
	}
	
	// Sequence: -0.5, 0, 0.5, 0, -0.5, 0, 0.5...
	public static double[] generateI(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new double[0];
		}
		
		double [] array = new double[n];

		for(int i=0;i<n;i++){
			array[i]= 0.5*(i%(((i+1)%2+1)*2)-1);
		}
		return array;

		// for (int i = 0; i < n; i++) {
        //     Double value = -0.5 * Math.cos(Math.PI / 2 * i);
        //     BigDecimal bigDecimalValue = new BigDecimal(value).setScale(1, RoundingMode.HALF_DOWN);
        //     array[i] = bigDecimalValue.doubleValue();
        // }

		// return array;
	}
	
	// Sequence: 0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 4, 5, 6...
	public static int[] generateJ(int n) {
		if(n<0){
			return null;
		} else if (n==0){
			return new int[0];
		}
		
		int [] array = new int[n];

		for(int i=0;i<n;i++){
			array[i]= i%4 + i/4;
		}
		return array;
	}

	// oh being cheeky with the if statements?
	// return the exact number appearing in the sequence for the given i
	// if (i < 0) return i;
	// Sequence: -0.5, 0, 0.5, 0, -0.5, 0, 0.5...
	public static double generateI2(int i) {
		if(i<0){
			return i;
		}

		Double value = -0.5 * Math.cos(Math.PI / 2 * i);
		BigDecimal bigDecimalValue = new BigDecimal(value).setScale(1, RoundingMode.HALF_DOWN);
		return bigDecimalValue.doubleValue();
	}	

	
	// oh being cheeky with the if statements?
	// return the exact number appearing in the sequence for the given i
	// if (i <= 0) return i;
	// Sequence: 0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 4, 5, 6...
	public static int generateJ2(int i) {
		if(i<0){
			return i;
		}
		return i%4 + i/4;
	}

}


