package com.builder;

import java.util.ArrayList;

public class BuilderClient {

	public static void main(String[] args) {
		
		ArrayList<String> sequenceList = new ArrayList<>();
		sequenceList.add("start");
		sequenceList.add("alarm");
		sequenceList.add("engineBoom");
		sequenceList.add("stop");
		//�����쳵ģ��
		JiliCarBuilder jiliCarBuilder = new JiliCarBuilder();
		jiliCarBuilder.setSequence(sequenceList);
		CarModel jiLiCar = jiliCarBuilder.getCarModel();
		jiLiCar.templateMethod();
		
		
		
		
		
		
		
		
	}
}
