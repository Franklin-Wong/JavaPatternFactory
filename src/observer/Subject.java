package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	
	private List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer observer){
		list.add(observer);
	}
	
	public void unregisterObserver(Observer observer){
		list.remove(observer);
	}
	public void notifyAllObserver(){
		for( Observer observer : list){
			observer.update(this);
		}
	}

}
