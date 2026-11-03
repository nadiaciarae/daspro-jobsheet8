import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ticket, ticketPrice = 50000;
        int totalTickets = 0;
        double price, totalSales = 0;
        System.out.println("---Cinema Ticket Sales Calculator---");

        do {
            System.out.print("Enter number of tickets (type '0' to exit): ");
            ticket = input.nextInt();
            
            if (ticket < 0) {
                System.out.println("Invalid input");
                continue;
            } else if (ticket > 0) {
                price = ticket * ticketPrice;
                if (ticket > 10) {
                    price = price * 85 / 100;
                } else if (ticket > 4) {
                    price = price * 90 / 100;
                }
                System.out.println("Price to be paid: Rp" + (int) price);
                totalTickets += ticket;
                totalSales += price;
            }
        } while (ticket != 0);

        System.out.println("\nResults");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total ticket sales: Rp" + totalSales);

        input.close();
    }
}