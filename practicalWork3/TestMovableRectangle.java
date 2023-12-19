package practicalWork3;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle movableRectangle1 = new MovableRectangle(1, 5, 12, 3, 7, 9);
        System.out.println(movableRectangle1);
        movableRectangle1.moveUp(20);
        System.out.println(movableRectangle1);
        movableRectangle1.moveLeft(15);
        System.out.println("" + movableRectangle1 +'\n');

        MovableRectangle movableRectangle2 = new MovableRectangle(4, 57, 8, 4, 4, 7);
        System.out.println(movableRectangle2);
        movableRectangle2.moveUp(89);
        System.out.println(movableRectangle2);
        movableRectangle2.moveLeft(13);
        System.out.println("" + movableRectangle2 +'\n');
    }
}
