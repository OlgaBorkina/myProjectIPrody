package geometricFigures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double area = (double) 1 / 2 * sideA * sideB;
        BigDecimal num = new BigDecimal(area);
        num = num.setScale(2, RoundingMode.HALF_EVEN);
        area = num.doubleValue();

        return area;
    }
}
