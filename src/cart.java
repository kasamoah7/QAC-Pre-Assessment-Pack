import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class cart {
	private ArrayList<ticket> tickets;

	public cart() {
		tickets = new ArrayList<ticket>();
	}

	public void addChildTickets(int numberOfTickets) {
		for (int i = 0; i < numberOfTickets; i++) {
			childTicket newTicket = new childTicket();
			tickets.add(newTicket);
		}
	}

	public float getTotalCostOfTickets() {
		float total = 0.0f;
		for (ticket ticket : tickets) {
			total = total + ticket.getPrice();
		}
		TimeZone timeZone = TimeZone.getTimeZone("UTC");
	     Calendar calendar =  Calendar.getInstance(timeZone);
	     calendar.setTime(new Date());
	     DateFormat simpleDateFormat = new SimpleDateFormat("E dd MMM yyyy HH:mm:ss");
	     simpleDateFormat.setTimeZone(timeZone);
	     if( simpleDateFormat.format(calendar.getTime()).contains("Wed")){
	    	 total = total - (2f * tickets.size());
	     }


		return total;
	}

	public void addStudentTickets(int numberOfTickets) {
		for (int i = 0; i < numberOfTickets; i++) {
			studentTicket newTicket = new studentTicket();
			tickets.add(newTicket);
		}
		
	}

	public void addOapTickets(int numberOfTickets) {
		for (int i = 0; i < numberOfTickets; i++) {
			oapTicket newTicket = new oapTicket();
			tickets.add(newTicket);
		}
		
	}

	public void addStandardTickets(int numberOfTickets) {
		for (int i = 0; i < numberOfTickets; i++) {
			standardTicket newTicket = new standardTicket();
			tickets.add(newTicket);
		}
		
	}

}
