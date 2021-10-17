package com.builder;

public class JIliCar extends CarModel{

	@Override
	protected void start() {
		System.out.println("jili start");
		
	}

	@Override
	protected void stop() {
		System.out.println("jili stop");
		
	}

	@Override
	protected void alarm() {
		System.out.println("jili alarm");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("jili engineBoom");
		
	}


	

}
