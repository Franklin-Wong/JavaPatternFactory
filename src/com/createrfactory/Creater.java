package com.createrfactory;

public abstract class Creater {
	
	public abstract <T extends Product>T createProduct(Class<T> c);
	
}
