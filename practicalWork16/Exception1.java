package practicalWork16;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0); // 2.0 / 0.0 = Infinity
        } catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
    }
}
