package geometricFigures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        BigDecimal num = new BigDecimal(area);
        num = num.setScale(2, RoundingMode.HALF_EVEN);
        area = num.doubleValue();

        return area;
    }
}
