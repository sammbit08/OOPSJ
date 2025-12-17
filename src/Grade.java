import java.util.Scanner;

class Grade {
    int marks;

    Grade(int marks) {
        this.marks = marks;
    }

    void displayGrade() {
        if (marks >= 90)
            System.out.println("Grade: O");
        else if (marks >= 80)
            System.out.println("Grade: E");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Grade g = new Grade(marks);
        g.displayGrade();

        sc.close();
    }
}
