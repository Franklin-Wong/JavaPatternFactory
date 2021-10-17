package com.builder;

import java.awt.List;
import java.util.ArrayList;

public abstract class CarModel {
	
	
	private ArrayList<String> sequenceList = new ArrayList<String>();
	/*
	* 首先， 这个模型要能发动起来， 别管是手摇发动， 还是电力发动， 反正
	* 是要能够发动起来， 那这个实现要在实现类里了
	*/
	protected abstract void start();
	//能发动， 还要能停下来， 那才是真本事
	protected abstract void stop();
	//喇叭会出声音， 是滴滴叫， 还是哔哔叫
	protected abstract void alarm();
	//引擎会轰隆隆地响， 不响那是假的
	protected abstract void engineBoom();
	//那模型应该会跑吧， 别管是人推的， 还是电力驱动， 总之要会跑
	public void templateMethod(){
		
		for (int i = 0; i < sequenceList.size(); i++) {
			String casename = sequenceList.get(i);
			if (casename.equalsIgnoreCase("start")) {
				//先发动汽车
				this.start();
			}else if (casename.equalsIgnoreCase("alarm")) {
				this.alarm();

			}else if (casename.equalsIgnoreCase("engineBoom")) {
				//引擎开始轰鸣
				this.engineBoom();
			}else if (casename.equalsIgnoreCase("stop")) {
				//引擎开始轰鸣
				this.stop();
			}
		}
	}
	final public void setSequence(ArrayList sequenceList) {
		this.sequenceList = sequenceList;
	}

	
}
