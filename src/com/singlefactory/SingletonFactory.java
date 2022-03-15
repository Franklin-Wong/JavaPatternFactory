package com.singlefactory;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton singleton;
	static{//ͨ���๹������ȡʵ��
		try {
			Class<?> c = Class.forName(Singleton.class.getName());
			Constructor<?> constructor = c.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
