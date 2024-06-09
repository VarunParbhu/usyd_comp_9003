import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {

	public static ArrayList<Double> data = new ArrayList<Double>();
	
	
	// Returns the mean of the given data set.
	public static double mean(ArrayList<Double> numbers) {
		if(numbers.size()==0){
			return Double.NaN;
		}
		Double _mean=0.0;
		for (int i=0;i<data.size();i++){
			_mean += numbers.get(i);
		}
		_mean /= numbers.size();
		return _mean;
	}
	
	// Returns the variance of the given data set.
	public static double variance(ArrayList<Double> numbers,double _mean) {
		if(numbers.size()==0){
			return Double.NaN;
		}
		Double _variance=0.0;
		for (int i=0;i<numbers.size();i++){
			_variance += Math.pow(numbers.get(i)-_mean,2);
		}
		_variance /=numbers.size();
		return _variance;
	}
	
	// Returns the standard deviation of the given data set.
	public static double sd(double variance) {
		if(variance==Double.NaN){
			return Double.NaN;
		}
		Double _stdDeviation=0.0;
		_stdDeviation = Math.sqrt(variance);
		return _stdDeviation;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter data set:");

		while (scan.hasNextDouble()){
			double d = scan.nextDouble();
			data.add(d);
		}

		System.out.println();
		if(data.size()==0){
			System.out.println("No data!");
		} else {
			System.out.printf("Mean = %.4f\nVariance = %.4f\nStandard deviation = %.4f",mean(data),variance(data,mean(data)),sd(variance(data,mean(data))));
			System.out.println();
		}
	} 
}
