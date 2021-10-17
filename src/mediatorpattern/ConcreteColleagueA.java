package mediatorpattern;

public class ConcreteColleagueA extends Colleague{

//	public ConcreteColleagueA(Mediator mediator) {
//		super(mediator);
//	}

	@Override
	public void action() {
		System.out.println("ColleagueA----将信息传递给中介者");
		
	}

}
