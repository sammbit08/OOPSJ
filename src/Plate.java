import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate Dimensions: " + length + " x " + width);
    }
}

class BoxMI extends Plate {
    double height;

    BoxMI(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box Height: " + height);
    }
}

class WoodBox extends BoxMI {
    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox Thickness: " + thick);
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        new WoodBox(l, w, h, t);

        sc.close();
    }
}
