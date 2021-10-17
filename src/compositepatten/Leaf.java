package compositepatten;

public class Leaf extends Component{

	private String message = "叶子节点没有子节点";
	public Leaf(String name) {
		super(name);
	}
	@Override
	public void doSomething() {
		System.out.println(name);
	}
	@Override
	public void addChild(Component component) {
		throw new UnsupportedOperationException(message);
		
	}
	@Override
	public Component getChild(int i) {
		throw new UnsupportedOperationException(message);
	}
	@Override
	public void removeChild(Component component) {
		throw new UnsupportedOperationException(message);
		
	}
}
