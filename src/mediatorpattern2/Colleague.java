package mediatorpattern2;

public abstract class Colleague {
	//每一个同事 都要知道中介者
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
}
