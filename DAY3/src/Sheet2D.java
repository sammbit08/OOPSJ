import java.util.Scanner;

class Sheet2D {
    double length, width;
    double cost;

    Sheet2D(double length, double width) {
        this.length = length;
        this.width = width;
        cost = length * width * 40;
    }

    void displayCost() {
        System.out.println("Cost of 2D Sheet = Rs " + cost);
    }
}

class Box3D extends Sheet2D {
    double height;

    Box3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
        cost = length * width * height * 60;
    }

    void displayCost() {
        System.out.println("Cost of 3D Box = Rs " + cost);
    }
}

class PlasticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Box3D b = new Box3D(l, w, h);
        b.displayCost();

        sc.close();
    }
}
