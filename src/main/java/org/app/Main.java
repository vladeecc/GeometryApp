package org.app;

import org.example.Circle;
import org.example.Rectangle;
import org.example.Triangle;

public class Main {

    static void main() {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(7, 12);
        Triangle triangle = new Triangle(7, 7, 7);

        System.out.println("Круг");
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        System.out.println();

        System.out.println("Прямоугольник");
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println();

        System.out.println("Треугольник");
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}