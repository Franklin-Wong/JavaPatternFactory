package com.templetpattern;

public class Client {

	public static void main(String[] args) {
		Huma huma = new Huma();
		huma.setAlarm(true);
		huma.templateMethod();
	}
}
