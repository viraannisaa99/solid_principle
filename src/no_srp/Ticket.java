/**
 * Contoh tanpa penerapan SRP
 * Satu class memiliki dua tanggung jawab yang berbeda, yaitu addToStore dan isExpired
 */

package no_srp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Ticket {
		int id;
		String name, destination, date;

		public Ticket(int id, String name, String destination, String date) {
				this.id = id;
				this.name = name;
				this.destination = destination;
				this.date = date;
		}
}

class TicketService {
		ArrayList<Ticket> listTicket = new ArrayList<Ticket>();

		void addToList(Ticket ticket) {
				if(!isExpired(ticket.date)) {
						this.listTicket.add(ticket);
				}
		}

		void showTicket() {
				for(Ticket item: this.listTicket) {
						System.out.println("Name: " + item.name);
						System.out.println("Destination: " + item.destination);
						System.out.println("Date: " + item.date);
				}
		}

		/**
		 * isExpired() sebaiknya dibuat dalam class berbeda
		 */

		private boolean isExpired(String date) {
				Date ticketDate = new Date();
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd",  Locale.ENGLISH);

				try {
						ticketDate = dateFormat.parse(date);
				}catch(ParseException e){
						e.printStackTrace();
				}
				return ticketDate.getTime() >= now.getTime();
		}

}