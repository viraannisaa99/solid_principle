package with_srp;

public class MainClass {
		public static void main(String[] args) {
				TicketService ticket = new TicketService();

				ticket.addToList(new Ticket(1, "Vira", "Jakarta", "2021-06-25"));

				ticket.showTicket();
		}
}
