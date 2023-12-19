package practicalWork3;

public class TestCircle {
    public static void main(String[] args) {
        var circle1 = new Circle(12, "green", false);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println("" + circle1 + '\n');

        var circle2 = new Circle(5, "blue", true);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println("" + circle2 + '\n');

    }
}
