package com.mediatorpattern;

public abstract class Colleague {

	public Mediator mediator = null;
	//ͨ�����캯�������н���
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	
	
}
