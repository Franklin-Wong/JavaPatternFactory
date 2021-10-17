package com.builder;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequenceList = new ArrayList<>();
	private JiliCarBuilder carBuilder = new JiliCarBuilder();
	
	public JIliCar getJiliCar() {
		this.sequenceList.add("start");
		this.sequenceList.add("alarm");
		this.sequenceList.add("engineBoom");
		this.sequenceList.add("stop");
		//设置运行结果
		this.carBuilder.setSequence(sequenceList);
		return (JIliCar) this.carBuilder.getCarModel();
		
	}
}
