import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Managerr implements Salary {
    double basic;

    Managerr(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earn);
    }

    public void deductions() {
        double ded = 0.12 * basic;
        System.out.println("Deduction - " + ded);
    }
}

class Substaff extends Managerr {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bon = 0.5 * basic;
        System.out.println("Bonus - " + bon);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        s.earnings();
        s.deductions();
        s.bonus();
    }
}
