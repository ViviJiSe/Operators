import java.io.PrintStream;
import java.util.Scanner;

public class OverflowExample {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        out.print("Digite el primer numero: ");
        short firstNum =in.nextShort();

        out.print("Digite el segundo numero: ");
        short secondNum =in.nextShort();

        short result = (short)(firstNum*secondNum);
        out.println(result);


    }
}
