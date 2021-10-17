package proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler{

	//被代理的类 的引用
	private Object object;
	/**
	 * 在构造方法中初始化引用对象
	 * @param object
	 */
	public DynamicProxy(Object object) {
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用被代理对象的方法
		Object invoke = method.invoke(object, args);
		return invoke;
	}
}
