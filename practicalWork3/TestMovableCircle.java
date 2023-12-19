package practicalWork3;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle movableCircle1 = new MovableCircle(1, 0, 12, 3, 7);
        System.out.println(movableCircle1);
        movableCircle1.moveUp(20);
        System.out.println(movableCircle1);
        movableCircle1.moveLeft(15);
        System.out.println("" + movableCircle1 +'\n');

        MovableCircle movableCircle2 = new MovableCircle(38, 5, 24, 7, 16);
        System.out.println(movableCircle2);
        movableCircle2.moveDown(50);
        System.out.println(movableCircle2);
        movableCircle2.moveRight(3);
        System.out.println("" + movableCircle2 +'\n');
    }
}
