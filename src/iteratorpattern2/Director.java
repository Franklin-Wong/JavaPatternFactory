package iteratorpattern2;

public class Director extends AbstractLeader{

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.println("主管批复报销 ： "+ money +"元");		
		
	}

}
