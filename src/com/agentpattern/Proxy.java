package com.agentpattern;

public class Proxy implements Subject{
	
	public Subject subject = null;
	public Proxy(){
		this.subject = new Proxy();
	}
	public Proxy(Object object) {
		
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before(){
		
	}
	
	
	private void after(){
		
	}

}
