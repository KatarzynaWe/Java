package figures;

import static java.lang.Math.sqrt;

public class Triangle implements Figure {
    public float sideA;
    public float sideB;

    @Override
    public void getName() {
        System.out.println("TRIANGLE");
    }

    @Override
    public void getPerimeter() {
        double perimeter = sideA + sideB + sqrt(sideA * sideA + sideB * sideB);
        perimeter *= 100;
        perimeter = Math.round(perimeter);
        perimeter /= 100;
        System.out.println("The perimeter: " + perimeter);
    }

    @Override
    public void getArea() {
        float area = (sideA * sideB) / 2;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        System.out.println("The area: " + area);
    }
}
