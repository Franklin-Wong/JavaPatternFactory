package iteratorpattern2;

public class Manager extends AbstractLeader{

	@Override
	public int limit() {
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������ �� "+ money +"Ԫ");		
		
	}

}
