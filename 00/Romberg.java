/Screenshot 2024-06-09 at 14.45.02.png /Screenshot 2024-06-09 at 14.45.02 2.pngimport java.util.function.Function;

public class Romberg {
    /**
     * calculates R(n,m) where n = m = degree
     **/
    public static double integrate(Function<Double,Double> f, double lower, double upper, int degree) {
        // trapezoidal rule implemented below
        return (f.apply(lower) + f.apply(upper))*(upper - lower)*0.5;
    }
    
    public static void main(String[] args) {
        // tests
        double area, expected;
        
        area = integrate(x -> x*x, 0, 1, 5);
        expected = 0.3333333;
        // 99% accuracy
        assert Math.abs(area - expected) < Math.abs(0.01 * expected);
        
        area = integrate(x -> Math.sin(x), 0, Math.PI, 5);
        expected = 2;
        assert Math.abs(area - expected) < Math.abs(0.01 * expected);
    }
}
