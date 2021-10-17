package observerpattern;

import java.util.Observable;

public class TechFrontier extends Observable{

	public void postNews(String arg){
		//标识状态，或者改变
		setChanged();
		//通知所有的观察者
		notifyObservers(arg);
	}
	
}
