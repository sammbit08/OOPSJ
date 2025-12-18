import java.util.Scanner;

class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void volume() {
        System.out.println("Volume of Box = " + (length * width * height));
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Box b = new Box(l, w, h);
        b.volume();

        sc.close();
    }
}
