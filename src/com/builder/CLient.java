package com.builder;

import java.util.ArrayList;

public class CLient {

	public static void main(String[] args) {
		JIliCar jIliCar = new JIliCar();
		ArrayList<Object> sequenceList = new ArrayList<>();
		sequenceList.add("start");
		sequenceList.add("alarm");
		sequenceList.add("engineBoom");
//		sequenceList.add("stop");
		jIliCar.setSequence(sequenceList);
		jIliCar.templateMethod();
		
		
		Director director = new Director();
		director.getJiliCar().templateMethod();
	}
}
