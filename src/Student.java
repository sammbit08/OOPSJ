import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(roll + "  " + name + "  " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String lowCgpaName = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            s[i] = new Student(roll, name, cgpa);

            if (cgpa < minCgpa) {
                minCgpa = cgpa;
                lowCgpaName = name;
            }
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++)
            s[i].display();

        System.out.println("\nStudent with Lowest CGPA: " + lowCgpaName);

        sc.close();
    }
}
