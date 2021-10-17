package flyweightpattern2;

import java.util.Random;

public class TrainTicket implements Ticket{

	public String from;
	public String to;
	public String bunk;
	public int price;
	
	
	public TrainTicket(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}


	@Override
	public void showTicketInfo(String bunk) {
		price = new Random().nextInt(300);
		System.out.println("��Ʊ��"+from +"��"+to +"��"+bunk+"---�۸�"+price);
		
	}

}
