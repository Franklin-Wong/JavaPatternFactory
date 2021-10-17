package com.mediatorpattern;

public class Stock {
	
	public static int COMPUTER_NUMBER = 100;
	//库存增加
	public void  increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量为： "+COMPUTER_NUMBER);}
	//库存减少  
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为： "+COMPUTER_NUMBER);}
	
	//获取库存
	public int getNumber() {
		return COMPUTER_NUMBER;
	}
	//清理库存
	public void clearStock() {
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("加快销售-------停止采购");
		sale.offSale();
		purchase.refusePurhcase();
		
		
	}
	
			
	
	
	

}
