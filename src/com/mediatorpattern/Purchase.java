package com.mediatorpattern;

public class Purchase {
	
	public void buyCompute(int number) {
		Stock stock = new Stock();//���ʿ��
		Sale sale = new Sale();//��������
		int status = sale.getSaleStatus();
		if (status >80) {
			System.out.println("�ɹ�����"+number+"̨");
			stock.increase(number);
		}else if (status < 80) {
			int half = number/2;
			System.out.println("���۲��ã��۰�ɹ�"+ half);
		}
		
	}

	public void refusePurhcase() {
		System.out.println("��������-------------");
		
	}
}
