package Chapter11InheritanceAndPolymorphism;
import Chapter11InheritanceAndPolymorphism.Triangle;

import java.util.Scanner;
public class TestProgram {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter side 1 of the triangle: ");
     double side1 = input.nextDouble();
     System.out.print("Enter side 2 of the triangle: ");
     double side2 = input.nextDouble();
     System.out.print("Enter side 3 of the triangle: ");
     double side3 = input.nextDouble();
     System.out.print("Enter the color of the triangle: ");
     String color = input.next();
     System.out.print("Is the triangle filled? (true/false): ");
     boolean filled = input.nextBoolean();
     Triangle triangle=new Triangle(side1,side2,side3);
     triangle.setColor(color);
     triangle.setFilled(filled);

        System.out.println("\n" + triangle.toString());
        System.out.printf("Area: %.2f\n", triangle.getArea());
        System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
