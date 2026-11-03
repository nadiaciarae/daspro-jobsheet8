import java.util.Scanner;
public class SiakadWhile22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double grade, total;
        int i = 0;
        
        System.out.print("Enter the number of students: ");
        total = input.nextDouble();

        while (i < total) {
            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            grade = input.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!");
                continue;
            }

            if (grade > 80) {
                System.out.println("The grade of student " + (i + 1) + " is A");
                System.out.println("Good, keep the grade!");
            } else if (grade > 73) {
                System.out.println("The grade of student " + (i + 1) + " is B+");
            } else if (grade > 65) {
                System.out.println("The grade of student " + (i + 1) + " is B");
            } else if (grade > 60) {
                System.out.println("The grade of student " + (i + 1) + " is C+");
            } else if (grade > 50) {
                System.out.println("The grade of student " + (i + 1) + " is C");
            } else if (grade > 39) {
                System.out.println("The grade of student " + (i + 1) + " is D");
            } else {
                System.out.println("The grade of student " + (i + 1) + " is E");
            }

            i++;
        }

        input.close();
    }
}