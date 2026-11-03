import java.util.Scanner;
public class SiakadFor22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double grade, lowest = 100, highest = 0;

        for (int i = 1; i <= 10; i ++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = input.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
    input.close();
    }
}