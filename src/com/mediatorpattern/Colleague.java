package com.mediatorpattern;

public abstract class Colleague {

	public Mediator mediator = null;
	//通过构造函数传递中介者
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	
	
}
