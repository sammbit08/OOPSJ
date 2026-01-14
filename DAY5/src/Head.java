import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Managerrr extends Employee {
    void getDeptDetails();
}

class Head implements Managerrr {
    int empId, deptId;
    String empName, deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public static void main(String[] args) {
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
