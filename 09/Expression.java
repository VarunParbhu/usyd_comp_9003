
class Expression {
	
	// Round x to n decimal places.
	public static double round(double x, int n) {
		return Math.floor(x * Math.pow(10, n) + 0.5) / Math.pow(10, n);	
	}
	
	public static void main(String[] args) {
		// TODO
	}
}
