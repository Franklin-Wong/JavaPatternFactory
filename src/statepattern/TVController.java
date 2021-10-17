package statepattern;

public class TVController implements IPowerControllerInterface{

	IMethodsInterface methodsInterface;
	/**
	 * ͨ�� ��̬���� ���ò�ͬ�����ʵ�ַ���
	 * @param methodsInterface
	 */
	private void  setTVState(IMethodsInterface methodsInterface){
		this.methodsInterface = methodsInterface;
	}
	
	@Override
	public void powerOff() {
		setTVState(new TVPowerOffState());
		System.out.println("�ػ���");
		
	}

	@Override
	public void powerOn() {
		setTVState(new TVPowerOnState());
		System.out.println("������");
	}
	
	public void nextChannel() {
		methodsInterface.nextChannel();
		
	}

	public void preChannel() {
		methodsInterface.preChannel();
		
	}

	public void turnUp() {
		methodsInterface.turnUp();
		
	}

	public void turnDown() {
		methodsInterface.turnDown();
		
	}

}
