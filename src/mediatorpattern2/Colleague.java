package mediatorpattern2;

public abstract class Colleague {
	//ÿһ��ͬ�� ��Ҫ֪���н���
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
}
