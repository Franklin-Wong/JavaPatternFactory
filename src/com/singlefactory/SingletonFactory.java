package com.singlefactory;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton singleton;
	static{//通过类构造器获取实例
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
