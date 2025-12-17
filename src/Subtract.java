import java.util.Scanner;

class Subtract {

    void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Result = " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Result = " + (a - b));
    }
}

class SubtractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s.subtract(a, b);

        System.out.println("Enter three integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        s.subtract(x, y, z);

        System.out.println("Enter two double values:");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        s.subtract(p, q);

        sc.close();
    }
}
