package modelpattern;

public class MilitaryComputer extends AbstractComputer{
	@Override
	protected void checkHardWare() {
		super.checkHardWare();
		System.out.println("���Ӳ������ǽ");
	}
	@Override
	protected void login() {
		System.out.println("����ָ��ʶ���û���֤");
	}

}
