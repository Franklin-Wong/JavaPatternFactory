package mediatorpattern;

public class ConcreteMediator extends Mediator{

	@Override
	public void method() {
		colleagueA.action();
		colleagueB.action();
		
	}

}
