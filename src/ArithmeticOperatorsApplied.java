import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ArithmeticOperatorsApplied {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //Volume of a Cylinder

        double pi= Math.PI;
        double radius = 50.0;
        double height = 30.0;

        double volumeOfCylinder = pi* (Math.pow(radius,2)) * height;

        out.println(volumeOfCylinder);

        //ax^2+bx+c

        //x^2+4x+4

        double a = 1;
        double b = 4;
        double c = 4;

        double discriminant = (Math.pow(b,2))-4*a*c;

        out.println("The value of the discriminant is: " + discriminant);

        double x1= (-b-Math.sqrt(discriminant))/2*a;
        double x2= (-b+Math.sqrt(discriminant))/2*a;

        out.println("x1: " + x1);
        out.println("x2: " + x2);

    }
}
