package practicalWork3;

public class Square extends Rectangle{
    public Square(){}

    public Square(double side){
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square. Color: " + color +
                "; Is filled: " + filled +
                "; Side: " + width + ".";
    }
}
