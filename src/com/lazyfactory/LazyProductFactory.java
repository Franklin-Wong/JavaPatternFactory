package com.lazyfactory;

import java.util.HashMap;
import java.util.Map;

import com.createrfactory.NewProduct;
import com.createrfactory.OldProduct;
import com.createrfactory.Product;

public class LazyProductFactory {
	
	private static final Map<String, Product> prMap = new HashMap<>();

	public static synchronized Product createProduct(String type) {
		Product product = null;
		if (prMap.containsKey(type)) {//如果存在这个对象， 就赋值
			product = prMap.get(type);
		}else {//如果不存在，就创建其他对象,添加到集合
			if (type.equals("NewProduct")) {
				product = new NewProduct();
			} else {
				product = new OldProduct();
			}
			prMap.put(type, product);
		}
		return product;
		
	}
}
