package practicalWork3;

public class TestSquare {
    public static void main(String[] args) {
        var square1 = new Square(5, "blue", true);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println("" + square1 + '\n');

        var square2 = new Square(13, "green", false);
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());
        System.out.println("" + square2 + '\n');
    }
}
