import java.util.Scanner;

class StudCompare {
    int rollno;
    String name;

    StudCompare(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Overriding equals() method
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        StudCompare s = (StudCompare) obj;

        return rollno == s.rollno && name.equals(s.name);
    }
}

class EqualsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first student
        System.out.println("Enter details of first student");
        System.out.print("Enter Roll No: ");
        int r1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n1 = sc.nextLine();

        // Input for second student
        System.out.println("\nEnter details of second student");
        System.out.print("Enter Roll No: ");
        int r2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n2 = sc.nextLine();

        StudCompare s1 = new StudCompare(r1, n1);
        StudCompare s2 = new StudCompare(r2, n2);

        if (s1.equals(s2))
            System.out.println("\nBoth students are equal");
        else
            System.out.println("\nBoth students are not equal");

        sc.close();
    }
}
