package flyweightpattern2;

public class Test {

	public static void main(String[] args) {
		Ticket ticket = TicketFactory.getTcket("A", "B");
		ticket.showTicketInfo("…œ∆Ã");
		Ticket ticket1 = TicketFactory.getTcket("A", "B");
		ticket.showTicketInfo("…œ∆Ã");
		
		
	}
}
