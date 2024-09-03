package Part1.Types;

import java.awt.*;

public class PrimitiveVSReference {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
