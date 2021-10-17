package proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 */
public class DynamicProxy implements InvocationHandler{

	//��������� ������
	private Object object;
	/**
	 * �ڹ��췽���г�ʼ�����ö���
	 * @param object
	 */
	public DynamicProxy(Object object) {
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//���ñ��������ķ���
		Object invoke = method.invoke(object, args);
		return invoke;
	}
}
