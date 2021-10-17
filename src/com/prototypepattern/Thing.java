package com.prototypepattern;

public class Thing implements Cloneable{
	
	
	public Thing() {
		System.out.println("Thing的构造函数-----------");
	}

	@Override
	protected Thing clone() throws CloneNotSupportedException {
		return (Thing) super.clone();
	}

	/*
	 * 至人无己
	 * 神人无功
	 * 圣人无名 
	 */
}
