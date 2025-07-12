package geometricFigures;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = Math.pow(side, 2);

        return area;

    }
}
