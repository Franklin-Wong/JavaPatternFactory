package com.prototypepattern;

public class Thing implements Cloneable{
	
	
	public Thing() {
		System.out.println("Thing-----------");
	}

	@Override
	protected Thing clone() throws CloneNotSupportedException {
		return (Thing) super.clone();
	}

}
