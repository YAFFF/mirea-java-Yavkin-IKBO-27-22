package practicalWork16;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
