package com.adapterpattern;

public class Test {

	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter(new Volt220());
		System.out.println("�����ѹ ��"+adapter.getVolt5());
	}
}
