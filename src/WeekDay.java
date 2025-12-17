import java.util.Scanner;

class WeekDay {
    int day;

    WeekDay(int day) {
        this.day = day;
    }

    void displayDay() {
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid Day Number");
        }
    }
}

class WeekDayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();

        WeekDay wd = new WeekDay(day);
        wd.displayDay();

        sc.close();
    }
}
