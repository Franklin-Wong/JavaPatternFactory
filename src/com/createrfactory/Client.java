package com.createrfactory;

public class Client {

	public static void main(String[] args) {
		ConcretCreater concretCreater = new ConcretCreater();
		Product product = concretCreater.createProduct(Product.class);
		Product newProduct = concretCreater.createProduct(NewProduct.class);
		
		
	}
}
