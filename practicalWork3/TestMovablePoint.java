package practicalWork3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(1, 0, 12, 3);
        System.out.println(movablePoint1);
        movablePoint1.moveUp(20);
        System.out.println(movablePoint1);
        movablePoint1.moveLeft(15);
        System.out.println("" + movablePoint1 +'\n');

        MovablePoint movablePoint2 = new MovablePoint(1, 0, 12, 3);
        System.out.println(movablePoint2);
        movablePoint2.moveUp(20);
        System.out.println(movablePoint2);
        movablePoint2.moveLeft(15);
        System.out.println("" + movablePoint2 +'\n');
    }
}
