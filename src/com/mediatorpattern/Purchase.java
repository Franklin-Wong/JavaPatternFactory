package com.mediatorpattern;

public class Purchase {
	
	public void buyCompute(int number) {
		Stock stock = new Stock();//访问库存
		Sale sale = new Sale();//访问销售
		int status = sale.getSaleStatus();
		if (status >80) {
			System.out.println("采购电脑"+number+"台");
			stock.increase(number);
		}else if (status < 80) {
			int half = number/2;
			System.out.println("销售不好，折半采购"+ half);
		}
		
	}

	public void refusePurhcase() {
		System.out.println("不用买了-------------");
		
	}
}
