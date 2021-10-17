package mediatorpattern;

public class ConcreteColleagueB extends Colleague{

	public ConcreteColleagueB() {
//		this(null);
	}
//	public ConcreteColleagueB(Mediator mediator) {
//		super(mediator);
//		// TODO Auto-generated constructor stub
//	}

	
	@Override
	public void action() {
		System.out.println("ColleagueB----将信息传递给中介者");
		
	}

}
