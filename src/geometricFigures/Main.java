package geometricFigures;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Figure[] sumAreas = new Figure[]{new Square(5),
                new Circle(4),
                new Triangle(3.8, 6.9),
                new Square(2)
        };


        System.out.println(" Total  area is  " + FigureUtils.calculateTotalArea(sumAreas));
    }

}
