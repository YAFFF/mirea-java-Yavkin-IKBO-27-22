package practicalWork2;

public class TestBall {
    public static void main(String[] args) {
        var ball1 = new Ball(100, 100);
        System.out.println(ball1);
        ball1.move(30, 15);
        System.out.println(ball1);

        var ball2 = new Ball();
        ball2.setXY(50, 60);
        System.out.println(ball2);
        ball2.move(13, 45);
        System.out.println(ball1);
    }
}
