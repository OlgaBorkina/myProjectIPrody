package geometricFigures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FigureUtils {

    public static double calculateTotalArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure f : figures) {
            totalArea += f.area();
        }
        BigDecimal num = new BigDecimal(totalArea);
        num = num.setScale(2, RoundingMode.HALF_EVEN);
        totalArea = num.doubleValue();
        return totalArea;
    }
}
