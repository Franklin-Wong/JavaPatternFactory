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
		if (prMap.containsKey(type)) {//�������������� �͸�ֵ
			product = prMap.get(type);
		}else {//��������ڣ��ʹ�����������,��ӵ�����
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
