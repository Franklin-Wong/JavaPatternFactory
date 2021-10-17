package decoratorpattern;

public class ConcretDecoratorB extends Decorator{

	public ConcretDecoratorB(Component component) {
		super(component);
	}
	@Override
	public void operate() {
		super.operate();
		operateB();
	}
	public void operateA(){
		System.out.println("ConcretDecoratorB--------operateA");
	}
	public void operateB(){
		System.out.println("ConcretDecoratorB--------operateA");
	}
}
