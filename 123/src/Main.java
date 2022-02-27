import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static int intInput()  {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true){
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error type! Please enter an integer value");
                scanner.next();
            }
        }
        return input;
    }

    public static void main(String[] args) {



        FractionExpression myExpression = new FractionExpression();




    }
}
