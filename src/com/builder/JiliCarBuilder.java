package com.builder;

import java.util.ArrayList;

public class JiliCarBuilder extends CarBuilder{

	private JIliCar jiliCar = new JIliCar();
	
	
	@Override
	public void setSequence(ArrayList<String> sequenceList) {
		
		this.jiliCar.setSequence(sequenceList);
	}

	@Override
	public CarModel getCarModel() {
		return jiliCar;
	}

}
