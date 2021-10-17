package decoratorpattern;

public class ConcretComponent extends Component{

	@Override
	public void operate() {
		System.out.println("ConcretComponent------operate");
	}
}
