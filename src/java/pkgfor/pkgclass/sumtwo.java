
import java.util.Scanner;

/**
 *
 * @author Walton
 */
public class sumtwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2, sum;
        System.out.println("Enter the first number :");
        number1 = in.nextInt();
        System.out.println("Enter the second number :");
        number2 = in.nextInt();
        sum = number1 + number2;
        System.out.println("The summation is " + sum);
    }
}
