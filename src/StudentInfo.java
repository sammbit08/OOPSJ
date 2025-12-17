import java.util.Scanner;

class StudentInfo {
    String name, section, branch;
    int rollno;

    StudentInfo(String name, int rollno, String section, String branch) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
        this.branch = branch;
    }

    void displayDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Section : " + section);
        System.out.println("Branch  : " + branch);
    }
}

class StudentInfoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        StudentInfo st = new StudentInfo(name, rollno, section, branch);
        st.displayDetails();

        sc.close();
    }
}
