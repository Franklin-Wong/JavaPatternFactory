package com.multifactory;

import com.createrfactory.OldProduct;
import com.createrfactory.Product;

public class OldProductFactory implements FactoryInterface{

	@Override
	public Product createProduct() {
		return new OldProduct();
	}

}
