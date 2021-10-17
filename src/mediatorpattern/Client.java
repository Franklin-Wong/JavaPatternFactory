package mediatorpattern;

public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA( );
		
		mediator.setColleagueA(colleagueA);
		
		ConcreteColleagueB colleagueB = new ConcreteColleagueB();
		mediator.setColleagueB(colleagueB);
		mediator.method();
		
	}

}
