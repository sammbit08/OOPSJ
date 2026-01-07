import java.util.Scanner;

class Account {
    static int autoAccNo = 1000;
    int accNo;
    String name;
    String accType;
    double balance;
    int day, month, year;

    Account(String name, String accType, double balance, int d, int m, int y) {
        this.accNo = ++autoAccNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        day = d;
        month = m;
        year = y;
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdraw method of Account class");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " (No charge)");
        } else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt);
            System.out.println("Penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Daily withdrawal limit exceeded");
        }
    }
}

class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter last deposit date (dd mm yyyy): ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Select Account Type (1-Standard, 2-Premium): ");
        int ch = sc.nextInt();

        Account acc;

        if (ch == 1)
            acc = new StandardAccount(name, bal, d, m, y);
        else
            acc = new PremiumAccount(name, bal, d, m, y);

        acc.checkBalance();

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);   // Dynamic Method Dispatch

        acc.checkBalance();
        sc.close();
    }
}
