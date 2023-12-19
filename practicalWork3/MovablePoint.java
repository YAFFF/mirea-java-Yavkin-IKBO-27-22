package practicalWork3;

public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MOVABLE_POINT. " +
                "x: " + x +
                "; y: " + y +
                "; xSpeed: " + xSpeed +
                "; ySpeed: " + ySpeed +
                '.';
    }

    @Override
    public void moveUp(int displacementY) {
        y += displacementY;
    }

    @Override
    public void moveDown(int displacementY) {
        y -= displacementY;
    }

    @Override
    public void moveRight(int displacementX) {
        x += displacementX;
    }

    @Override
    public void moveLeft(int displacementX) {
        x -= displacementX;
    }
}
