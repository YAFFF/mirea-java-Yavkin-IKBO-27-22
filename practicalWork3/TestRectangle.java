package practicalWork3;

public class TestRectangle {
    public static void main(String[] args) {
        var rectangle1 = new Rectangle(2, 6, "blue", true);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println("" + rectangle1 + '\n');

        var rectangle2 = new Rectangle(3, 8, "green", false);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println("" + rectangle2 + '\n');
    }
}
