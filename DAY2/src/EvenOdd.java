import java.util.Scanner;

class EvenOdd {
    int even = 0, odd = 0;

    EvenOdd(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                even++;
            else
                odd++;
        }
    }

    void displayResult() {
        System.out.println("Number of Even numbers: " + even);
        System.out.println("Number of Odd numbers : " + odd);
    }
}

class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        EvenOdd eo = new EvenOdd(numbers);
        eo.displayResult();

        sc.close();
    }
}
