package com.mediatorpattern;

public abstract class Mediator {
	//����ͬ����
	protected Colleague1 colleague1;
	protected Colleague2 colleague2;
	//
	public Colleague1 getColleague1() {
		return colleague1;
	}
	public void setColleague1(Colleague1 colleague1) {
		this.colleague1 = colleague1;
	}
	public Colleague2 getColleague2() {
		return colleague2;
	}
	public void setColleague2(Colleague2 colleague2) {
		this.colleague2 = colleague2;
	}
	
	//�н���ģʽ��ҵ���߼�
	public abstract void doSomgthing1();
	public abstract void doSomething2();
	
	
	
	
}
