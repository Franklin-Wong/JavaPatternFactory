package com.mediatorpattern;

public class Client {

	public static void main(String[] args) {
		
		//�ɹ���Ա�ɹ�����
		Purchase purchase = new Purchase();
		purchase.buyCompute(100);
		
		//������Ա���۵���
		Sale sale = new Sale();
		sale.sellComputer(1);
		System.out.println("�����˵���");
		//������
		Stock stock = new Stock();
		stock.clearStock();
		System.out.println("������------------------");

	}
}
