package com.builder;

import java.util.ArrayList;

public abstract class CarBuilder{
	public abstract void setSequence(ArrayList<String> sequenceList);//设置模型的顺序
	public abstract CarModel getCarModel();//获取模型
	

	
}
