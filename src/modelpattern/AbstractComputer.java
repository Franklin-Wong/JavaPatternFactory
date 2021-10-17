package modelpattern;

public abstract class AbstractComputer {
	protected void powerOn() {
		System.out.println("������Դ");
	}
	protected void checkHardWare() {
		System.out.println("Ӳ�����");
	}
	protected void loadOS() {
		System.out.println("�������ϵͳ");
	}
	protected void login() {
		System.out.println("ͨ���û���֤");
	}
	public final void startUp() {
		System.out.println("--------����  START----------");
		powerOn();
		checkHardWare();
		loadOS();
		login();
		System.out.println("--------�ػ�  END----------");
}
}
