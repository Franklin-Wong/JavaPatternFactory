package iteratorpattern2;

public class Boss extends AbstractLeader{

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 50000000;
	}

	@Override
	public void handle(int money) {
		System.out.println("�ϰ��������� �� "+ money +"Ԫ");		
		
	}

}
