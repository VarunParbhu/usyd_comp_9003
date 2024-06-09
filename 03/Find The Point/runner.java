public class runner{
    public static void main(String[] args){
        Point2D test1 = new Point2D(0.3,15);
        Point2D test2 = new Point2D(12.3,1.9);
        Point2D test3 = Line.findPoint(test1,test2,0);

        for(double i : test3.getCoords()){
            System.out.print(i + " ");
        }
        System.out.println();

    
    }
}
