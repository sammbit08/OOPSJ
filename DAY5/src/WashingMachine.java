import java.util.Scanner;

interface Motor {
    void run();
    void consume();
}

class WashingMachine implements Motor {
    int capacity;

    WashingMachine(int capacity) {
        this.capacity = capacity;
    }

    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter motor capacity: ");
        int cap = sc.nextInt();

        WashingMachine wm = new WashingMachine(cap);

        wm.run();
        wm.consume();

        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
