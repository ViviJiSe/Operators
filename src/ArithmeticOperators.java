import java.io.PrintStream;
import java.util.Scanner;

public class ArithmeticOperators {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //Java Operators

        //Arithmetic Operators
            //______________________________________________________________________________
            //Sum Operator (+)
            //______________________________________________________________________________

                int sumOfTwoNumbers = 10 + 5; // here we are using the sum operator with two int literals

                int sumOfVariableAndLiteral = sumOfTwoNumbers + 20;  //here we are using the sum operator with a variable and a literal

                //  here the resulting value of this variable will be 50
                int sumOfTwoVariables = sumOfTwoNumbers + sumOfVariableAndLiteral; // gere we are using the sum operator with two variables

                out.println(sumOfTwoVariables);

            //______________________________________________________________________________
            //Subtraction Operator (-)
            //______________________________________________________________________________

                int subtractionOfTwoNumbers = 5-10;

                out.println(subtractionOfTwoNumbers);

                int subtractionOfVariableAndLiteral = subtractionOfTwoNumbers - 20;

                out.println(subtractionOfVariableAndLiteral);

                int subtractionOfTwoVariables = subtractionOfVariableAndLiteral -(-subtractionOfTwoNumbers);
                out.println(subtractionOfTwoVariables);

            //______________________________________________________________________________
            //  Multiplication Operator (*)
            //______________________________________________________________________________

                out.println("Multiplication results");

                int multiplicationOfTwoNumbers = 5*6;

                out.println(multiplicationOfTwoNumbers);

                int multiplicationOfVariableAndLiteral = multiplicationOfTwoNumbers * 100;

                out.println(multiplicationOfVariableAndLiteral);

                int multiplicationOfTwoVariables = multiplicationOfTwoNumbers * multiplicationOfVariableAndLiteral;

                out.println(multiplicationOfTwoVariables);

            //______________________________________________________________________________
            //  Division Operator (/ = cociente) (% = residuo)
            //______________________________________________________________________________

            // Operator (/)

                out.println("Division results");

                double resultOfFullDivision = 32.0/5;

                out.println(resultOfFullDivision);

                int resultOfModuleDivision = 32 % 5;
                out.println(resultOfModuleDivision);

            //______________________________________________________________________________
            //  Increment and decrement
            //______________________________________________________________________________

                out.println("Increment and Decrement");

                int count =10;
                out.println("Value of count: " + count);

                int previousValue = count++; // count= count +1|Post Increment
                out.println("Value of count: " + count);
                out.println("Value of previousValue: " + previousValue);

                int preIncrementReturnValue =  ++count; //Pre-increment
                out.println("Value of count: " + count);
                out.println("Value of preIncrementReturnValue: " + preIncrementReturnValue);

                count=10;
                int postDecrement = count--;
                out.println("Value of count: " + count);
                out.println("Value of postDecrement: " + postDecrement);

                count=10;
                int preDecrement = --count;
                out.println("Value of count: " + count);
                out.println("Value of preDecrement: " + preDecrement);












    }
}
