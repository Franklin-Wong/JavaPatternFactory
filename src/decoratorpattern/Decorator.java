package decoratorpattern;

public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}
	@Override
	public void operate() {
		component.operate();
	}
}
