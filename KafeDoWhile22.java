import java.util.Scanner;
public class KafeDoWhile22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int coffee, coffeePrice = 12000;
        int tea, teaPrice = 7000;
        int bread, breadPrice = 20000;
        int totalPrice;
        String customerName;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName =  input.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled");
                break;
            }

            System.out.print("Number of coffee: ");
            coffee = input.nextInt();
            System.out.print("Number of tea: ");
            tea = input.nextInt();
            System.out.print("Number of bread: ");
            bread = input.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total to be paid: Rp" + totalPrice);
            input.nextLine();
        } while (true);

        System.out.print("All transactions completed");
        input.close();
    }
}
