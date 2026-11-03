import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int types, duration, fee, fixedRate = 12500, total = 0;
        System.out.println("---Parking Fee Calculator---");

        do {
            System.out.print("Enter vehicle type (1 car, 2 motorcycle, 0 exit): ");
            types = input.nextInt();

            if (types == 0) {
                break;
            } else if (types != 1 && types != 2) {
                System.out.println("Invalid input");
                continue;
            }

            System.out.print("Enter the duration: ");
            duration = input.nextInt();
            if (duration <= 0) {
                System.out.println("Invalid input");
                continue;
            }

            if (types == 1) {
                fee = duration * 3000;
            } else {
                fee = duration * 2000;
            }

            if (duration > 5) {
                fee += fixedRate;
            }
            total += fee;
            System.out.println("Price to be paid: Rp" + fee);
        } while (types != 0);

        System.out.println("\nResults");
        System.out.println("Total fees collected: Rp" + total);
        input.close();
    }
}