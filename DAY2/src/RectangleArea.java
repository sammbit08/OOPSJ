import java.util.Scanner;

class RectangleArea {
    double length, breadth;

    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class RectangleAreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        RectangleArea r = new RectangleArea(l, b);
        r.displayArea();

        sc.close();
    }
}
