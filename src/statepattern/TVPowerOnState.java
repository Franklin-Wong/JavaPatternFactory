package statepattern;

public class TVPowerOnState implements IMethodsInterface{

	@Override
	public void nextChannel() {
		System.out.println("��һ��Ƶ��");
		
	}

	@Override
	public void preChannel() {
		System.out.println("��һ��Ƶ��");
		
	}

	@Override
	public void turnUp() {
		System.out.println("��������");
		
	}

	@Override
	public void turnDown() {
		System.out.println("��С����");
		
	}

}
