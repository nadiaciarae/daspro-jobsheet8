import java.util.Scanner;
public class SiakadFor22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double grade, lowest = 100, highest = 0;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i ++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = input.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        
        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);
        input.close();
    }
}