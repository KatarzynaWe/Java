package figures;

import java.util.Scanner;

public class FigureTest {
    public static void main(String[] args) {

        try {
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Rectangle rectangle = new Rectangle();
            Scanner scanner = new Scanner(System.in);

            System.out.println("-> Enter the radius of the circle: ");
            circle.radius = scanner.nextDouble();

            System.out.println(" ");
            System.out.println("-> Enter the length of the first side of the rectangular triangle: ");
            triangle.sideA = scanner.nextFloat();

            System.out.println("-> Enter the length of the second side of the rectangular triangle: ");
            triangle.sideB = scanner.nextFloat();

            System.out.println(" ");
            System.out.println("-> Enter the length of the first side of the rectangle: ");
            rectangle.sideA = scanner.nextFloat();

            System.out.println("-> Enter the length of the second side of the rectangle: ");
            rectangle.sideB = scanner.nextFloat();

            Figure[] figures = new Figure[] {circle,triangle,rectangle};

            System.out.println(" ");
            System.out.println("<<< Calculation results >>>");
            System.out.println(" ");

            for (Figure figure : figures){
                figure.getName();
                figure.getPerimeter();
                figure.getArea();
                System.out.println(" ");
            }
        } catch (Exception e) {
            System.out.println("Wrong number. Enter number with or without a comma");
        }
    }
}
