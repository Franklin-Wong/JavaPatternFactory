package flyweightpattern2;

public class Test {

	public static void main(String[] args) {
		Ticket ticket = TicketFactory.getTcket("A", "B");
		ticket.showTicketInfo("����");
		Ticket ticket1 = TicketFactory.getTcket("A", "B");
		ticket.showTicketInfo("����");
		
		
	}
}
