import java.util.Scanner;

public class PrototypeCinemaSystem {
	public static void main(String[] args) {
		System.out.println("Hello Welcome to QA Cinemas Ticket Purchasing System");
		cart shoppingCart = new cart();
		System.out.print("How many child tickets do you want?:");
		Scanner input = new Scanner(System.in);
		int numberOfTickets = input.nextInt();
		shoppingCart.addChildTickets(numberOfTickets);
		System.out.print("How many student tickets do you want?:");
		numberOfTickets = input.nextInt();
		shoppingCart.addStudentTickets(numberOfTickets);
		System.out.print("How many OAP tickets do you want?:");
		numberOfTickets = input.nextInt();
		shoppingCart.addOapTickets (numberOfTickets);
		System.out.print("How many standard tickets do you want?:");
		numberOfTickets = input.nextInt();
		shoppingCart.addStandardTickets (numberOfTickets);
		float totalCostOfTickets = shoppingCart.getTotalCostOfTickets();
		System.out.print("The total cost of tickets for this movie is £" + totalCostOfTickets);
	}

}
