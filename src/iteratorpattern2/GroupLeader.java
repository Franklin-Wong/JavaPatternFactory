package iteratorpattern2;

public class GroupLeader extends AbstractLeader{

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("�鳤�������� �� "+ money +"Ԫ");		
	}

}
