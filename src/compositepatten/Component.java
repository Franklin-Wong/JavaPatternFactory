package compositepatten;

public abstract class Component {

	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	public abstract void doSomething();
	public abstract void addChild(Component component);
	public abstract Component getChild(int i);

	public abstract void removeChild(Component component);
}
