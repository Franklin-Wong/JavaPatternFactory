package decoratorpattern;

public class ConcretDecoratorA extends Decorator{

	public ConcretDecoratorA(Component component) {
		super(component);
	}
	@Override
	public void operate() {
		super.operate();
		operateA();
	}
	public void operateA(){
		System.out.println("ConcretDecoratorA--------operateA");
	}
	public void operateB(){
		System.out.println("ConcretDecoratorA--------operateB");
	}
}
