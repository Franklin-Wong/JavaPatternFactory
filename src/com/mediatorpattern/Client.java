package com.mediatorpattern;

public class Client {

	public static void main(String[] args) {
		
		//采购人员采购电脑
		Purchase purchase = new Purchase();
		purchase.buyCompute(100);
		
		//销售人员销售电脑
		Sale sale = new Sale();
		sale.sellComputer(1);
		System.out.println("销售了电脑");
		//清理库存
		Stock stock = new Stock();
		stock.clearStock();
		System.out.println("清理库存------------------");

	}
}
