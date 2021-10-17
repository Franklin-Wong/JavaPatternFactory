package com.createrfactory;

public class NewProductFactory extends Creater{

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		return null;
	}

}
