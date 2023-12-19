package practicalWork3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MOVABLE_RECTANGLE. " +
                "Top left: {" + topLeft +
                "}; Bottom right: {" + bottomRight +
                "}.";
    }

    @Override
    public void moveUp(int displacementY) {
        topLeft.moveUp(displacementY);
        bottomRight.moveUp(displacementY);
    }

    @Override
    public void moveDown(int displacementY) {
        topLeft.moveDown(displacementY);
        bottomRight.moveDown(displacementY);
    }

    @Override
    public void moveRight(int displacementX) {
        topLeft.moveRight(displacementX);
        bottomRight.moveRight(displacementX);
    }

    @Override
    public void moveLeft(int displacementX) {
        topLeft.moveLeft(displacementX);
        bottomRight.moveLeft(displacementX);
    }
}
