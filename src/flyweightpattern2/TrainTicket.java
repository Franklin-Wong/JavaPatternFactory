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
		System.out.println("车票："+from +"到"+to +"的"+bunk+"---价格："+price);
		
	}

}
