package observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 一个观察者
 * @author Administion
 *
 */
public class Coder implements Observer{
	
	private String name;
	

	public Coder(String name) {
		this.name = name;
	}


	@Override
	public void update(Observable o, Object arg) {
		System.out.println("您好 ，"+name + "-----"+arg);
	}


	@Override
	public String toString() {
		return "Coder [name=" + name + "]";
	}

}
