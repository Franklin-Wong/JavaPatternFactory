package com.mediatorpattern;

public class ConcreteColleague1 extends Colleague{

	
	
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	//�����Լ����߼�
	public void selfMethod1 () {
		
	}
	//��������
	public void depMethod1() {
		super.mediator.doSomgthing1();
	}

}
