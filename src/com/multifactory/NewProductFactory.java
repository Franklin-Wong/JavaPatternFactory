package com.multifactory;

import com.createrfactory.NewProduct;
import com.createrfactory.Product;

public abstract class NewProductFactory implements FactoryInterface{
	
	@Override
	public Product createProduct() {
		return new NewProduct();
	}

}
