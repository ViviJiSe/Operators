import java.io.PrintStream;
import java.util.Scanner;


public class MainJava {
    //varialables de clase

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //variable locales

        //datos primitivos long, int, short, double, float, char,//

        //Si no son datos primitivos se les conoce como objetos

        String someText = "We are programming";

        out.println(someText);

        someText = someText + ". This is more text.";

        // los string tienen asignacion de memoria dinamica

        //los objetos van a tener tamaños variables

        out.println(someText);











    }
}
