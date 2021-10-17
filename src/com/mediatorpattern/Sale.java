package com.mediatorpattern;

import java.util.Random;

public class Sale {
	
	public void  sellComputer(int number) {
		Stock stock = new Stock();
		//
		Purchase purchase = new Purchase();
		if (number > stock.getNumber()) {
			purchase.buyCompute(number);
			
			System.out.println("��������------------"+number+"̨");
			stock.decrease(number);
		}
		
	}
	//������������� 0��100֮��仯�� 0���������û������ 100����ǳ������� ��һ����һ��
	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int status = random.nextInt(100);
		System.out.println("���ۣ�"+status);
		return status;
	}

	
	//�ۼ�����
	public void offSale() {
		Stock stock = new Stock();
		System.out.println("�ۼ����� ��"+stock.getNumber());
	}
	
	
	
	
	
}