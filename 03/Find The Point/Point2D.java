//TODO
public class Point2D {
    public double x;
    public double y;
    private double[] coords = new double[2];

    public static double X1;
    public static double Y1;

    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
        this.coords[0]=x;
        this.coords[1]=y;
    }

    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }

    public double[] getCoords(){
        return this.coords;
    }
}
