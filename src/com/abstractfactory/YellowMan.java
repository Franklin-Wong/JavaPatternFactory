package com.abstractfactory;

public abstract class YellowMan implements Human{
	
	@Override
	public void getColor() {

		System.out.println("��ɫ");
	}
	@Override
	public void talk() {
		System.out.println("����");
	}

}
