package practicalWork3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        centre = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MOVABLE_CIRCLE. " +
                "Radius: " + radius +
                "; Centre: {" + centre +
                "}.";
    }

    @Override
    public void moveUp(int displacementY) {
        centre.moveUp(displacementY);
    }

    @Override
    public void moveDown(int displacementY) {
        centre.moveDown(displacementY);
    }

    @Override
    public void moveRight(int displacementX) {
        centre.moveRight(displacementX);
    }

    @Override
    public void moveLeft(int displacementX) {
        centre.moveLeft(displacementX);
    }
}
