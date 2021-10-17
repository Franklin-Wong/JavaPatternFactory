package decoratorpattern;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcretComponent();
		Decorator decoratorA = new ConcretDecoratorA(component);
		decoratorA.operate();
		Decorator decoratorB = new ConcretDecoratorB(component);
		decoratorB.operate();
	}
}
 