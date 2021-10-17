package com.multifactory;

import com.createrfactory.NewProduct;
import com.createrfactory.NewProductFactory;
import com.createrfactory.Product;

public class Work {

	public static void main(String[] args) {
		Product newProduct = (new NewProductFactory()).createProduct(null);
		
	}
}
