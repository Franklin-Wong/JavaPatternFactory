package modelpattern;

public class MilitaryComputer extends AbstractComputer{
	@Override
	protected void checkHardWare() {
		super.checkHardWare();
		System.out.println("检查硬件防火墙");
	}
	@Override
	protected void login() {
		System.out.println("进行指纹识别用户验证");
	}

}
