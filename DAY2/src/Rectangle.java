import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.calculateArea();
        r.calculatePerimeter();

        sc.close();
    }
}
