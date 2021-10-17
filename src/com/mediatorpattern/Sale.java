package com.mediatorpattern;

import java.util.Random;

public class Sale {
	
	public void  sellComputer(int number) {
		Stock stock = new Stock();
		//
		Purchase purchase = new Purchase();
		if (number > stock.getNumber()) {
			purchase.buyCompute(number);
			
			System.out.println("卖出电脑------------"+number+"台");
			stock.decrease(number);
		}
		
	}
	//反馈销售情况， 0～100之间变化， 0代表根本就没人卖， 100代表非常畅销， 出一个卖一个
	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int status = random.nextInt(100);
		System.out.println("销售："+status);
		return status;
	}

	
	//折价销售
	public void offSale() {
		Stock stock = new Stock();
		System.out.println("折价销售 ："+stock.getNumber());
	}
	
	
	
	
	
}