import java.util.Scanner;

class NameFormat {
    String firstName, lastName;

    NameFormat(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayName() {
        System.out.println(lastName + " " + firstName);
    }
}

class NameFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Second Name: ");
        String lastName = sc.nextLine();

        NameFormat nf = new NameFormat(firstName, lastName);
        nf.displayName();

        sc.close();
    }
}
