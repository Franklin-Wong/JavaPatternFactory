package com.createrfactory;

public class ConcretCreater extends Creater {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {

		Product product = null;
		try{
			product = (Product)Class.forName(c.getClass().toString()).newInstance();

		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return (T)product;
	}


}
