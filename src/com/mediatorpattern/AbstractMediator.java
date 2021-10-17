package com.mediatorpattern;

public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Stock stock;
	protected Sale sale;
	
	public AbstractMediator(){
		purchase = new Purchase();
		stock = new Stock();
		sale = new Sale();
	}
	
	public abstract void excute(String str,Object object);	


}
