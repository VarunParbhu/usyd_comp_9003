public class VolumeOfCylinder2{
    final static double pi = 3.141592;
    public static void main (String[] args){
        

        double radius = 0;
        double height = 0;
        double volume = 0;

        if (args.length<2){
            System.out.println("Not enough arguments.");
            System.exit(0);
        }

        if (args.length>2){
            System.out.println("Too many arguments.");
            System.exit(0);
        }

        radius = Double.parseDouble(args[0]);

        if (radius<0){
            System.out.println("Radius cannot be negative.");
            System.exit(0);
        }

        height = Double.parseDouble(args[1]);

        if (height<0){
            System.out.println("Height cannot be negative.");
            System.exit(0);
        }

        volume = pi*Math.pow(radius,2)*height;

        System.out.printf("The volume of the cylinder is %.2f.",volume);
        System.out.println();

    }
}
