package modelpattern;

public class CoderComputer extends AbstractComputer{
	@Override
	protected void login() {
		System.out.println("程序员用账号和密码登录");
	}
}
