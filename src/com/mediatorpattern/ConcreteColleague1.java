package com.mediatorpattern;

public class ConcreteColleague1 extends Colleague{

	
	
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	//处理自己的逻辑
	public void selfMethod1 () {
		
	}
	//依赖方法
	public void depMethod1() {
		super.mediator.doSomgthing1();
	}

}
