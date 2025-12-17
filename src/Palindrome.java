import java.util.Scanner;

class Palindrome {
    int num;

    Palindrome(int num) {
        this.num = num;
    }

    void checkPalindrome() {
        int temp = num, rev = 0, rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if (rev == num)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}

class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Palindrome p = new Palindrome(number);
        p.checkPalindrome();

        sc.close();
    }
}
