public class Line {

	private static double X1;
	private static double Y1;
	
	public Point2D findPoint(Point2D a, Point2D b, double d) {
		//d can only be between 0 and 1, return null if it not.
		//Find the point that 
        if(d<0 || d>1){
            return null;
        }

        X1 = a.x + (b.x - a.x)*d;
        Y1 = a.y + (b.y - a.y)*d;

        return new Point2D(X1,Y1);
	}
	
}
