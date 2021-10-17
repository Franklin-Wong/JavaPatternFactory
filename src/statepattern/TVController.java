package statepattern;

public class TVController implements IPowerControllerInterface{

	IMethodsInterface methodsInterface;
	/**
	 * 通过 多态属性 调用不同子类的实现方法
	 * @param methodsInterface
	 */
	private void  setTVState(IMethodsInterface methodsInterface){
		this.methodsInterface = methodsInterface;
	}
	
	@Override
	public void powerOff() {
		setTVState(new TVPowerOffState());
		System.out.println("关机了");
		
	}

	@Override
	public void powerOn() {
		setTVState(new TVPowerOnState());
		System.out.println("开机了");
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
