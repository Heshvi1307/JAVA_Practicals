import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    double area() {
        return l * w;
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double area() {
        return 0.5 * b * h;
    }
}

public class shapeareas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shapes: ");
        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            System.out.println("1. Circle  2. Rectangle  3. Triangle");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter radius: ");
                shapes[i] = new Circle(sc.nextDouble());
            } else if (ch == 2) {
                System.out.print("Enter length and width: ");
                shapes[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            } else if (ch == 3) {
                System.out.print("Enter base and height: ");
                shapes[i] = new Triangle(sc.nextDouble(), sc.nextDouble());
            }
        }

        double total = 0, largest = 0;
        Shape largestShape = null;

        for (Shape s : shapes) {
            double a = s.area();

            System.out.println("Area = " + a);
            total += a;

            if (a > largest) {
                largest = a;
                largestShape = s;
            }
        }

        System.out.println("Total Area = " + total);
        System.out.println("Largest Area = " + largest);
        System.out.println("Largest Shape = " +
                largestShape.getClass().getSimpleName());

        sc.close();
    }
}