package observer;

import java.util.Observable;

public class ConcretSubject extends Observable{
	private int mState = 0;

	public int getState() {
		return mState;
	}

	public void setState(int mState) {
		this.mState = mState;
		setChanged();
		notifyObservers();
//		this.notifyAllObserver();
	}
	
}
