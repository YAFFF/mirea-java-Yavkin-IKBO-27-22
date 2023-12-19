package practicalWork1;

public class BallTester {
    public static void main(String[] args){
        Ball ball1 = new Ball(0.5, "red");
        System.out.println(ball1.weightOnJupiter());
        System.out.println(ball1.colorWithColorBlindness());
        System.out.println(ball1 + "\n");

        Ball ball2 = new Ball(1.75, "green");
        System.out.println(ball2.weightOnJupiter());
        System.out.println(ball2.colorWithColorBlindness());
        System.out.println(ball2 + "\n");

        Ball ball3 = new Ball(2.0, "blue");
        System.out.println(ball3.weightOnJupiter());
        System.out.println(ball3.colorWithColorBlindness());
        System.out.println(ball3 + "\n");
    }
}
