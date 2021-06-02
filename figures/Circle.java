package figures;

public class Circle implements Figure {
    public double radius;

    @Override
    public void getName() {
        System.out.println("CIRCLE");
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        perimeter *= 100;
        perimeter = Math.round(perimeter);
        perimeter /= 100;
        System.out.println("The perimeter: " + perimeter);
    }
    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        System.out.println("The area: " + area);
    }
}
