
import javax.swing.JOptionPane;

public class sumtwogui {

    public static void main(String[] args) {
        String s1, s2;
        int num1, num2, sum;
        
        s1 = JOptionPane.showInputDialog("Enter first number :");
        s2 = JOptionPane.showInputDialog("Enter second number :");
        
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        
        sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "the sum is " + sum, "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
