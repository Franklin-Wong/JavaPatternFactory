package com.mediatorpattern;

public class Stock {
	
	public static int COMPUTER_NUMBER = 100;
	//�������
	public void  increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ�� "+COMPUTER_NUMBER);}
	//������  
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ�� "+COMPUTER_NUMBER);}
	
	//��ȡ���
	public int getNumber() {
		return COMPUTER_NUMBER;
	}
	//������
	public void clearStock() {
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("�ӿ�����-------ֹͣ�ɹ�");
		sale.offSale();
		purchase.refusePurhcase();
		
		
	}
	
			
	
	
	

}
