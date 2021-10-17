package compositepatten;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	private List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}
	public void addChild(Component component){
		components.add(component);
	}
	public Component getChild(int i){
		return components.get(i);
	}
	public void removeChild(Component component){
		components.remove(component);
	}
	@Override
	public void doSomething() {
		System.out.println(name);
		if (null != components) {
			for (Component c : components) {
				c.doSomething();
			}
		}
	}
}
