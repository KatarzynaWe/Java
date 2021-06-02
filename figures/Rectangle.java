package figures;

public class Rectangle implements Figure {
    public float sideA;
    public float sideB;

    @Override
    public void getName() {
        System.out.println("RECTANGLE");
    }

    @Override
    public void getPerimeter() {
        float perimeter = 2 * sideA + 2 * sideB;
        perimeter *= 100;
        perimeter = Math.round(perimeter);
        perimeter /= 100;
        System.out.println("The perimeter: " + perimeter);
    }

    @Override
    public void getArea() {
        float area = sideA * sideB;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        System.out.println("The area: " + area);
    }
}
