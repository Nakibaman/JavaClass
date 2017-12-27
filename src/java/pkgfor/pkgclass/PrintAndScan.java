
import java.util.Scanner;

public class PrintAndScan {

    public static void main(String[] args) {
        int a;
        Scanner ob = new Scanner(System.in);
        System.out.printf("Enter a number:\n");
        a = ob.nextInt();
        System.out.printf("The number is : %d", a);
    }
}
