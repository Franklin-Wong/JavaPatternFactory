package observer;

import java.util.Observable;

public class ConcretObserver implements Observer, java.util.Observer{

	private int mState;

	@Override
	public void update(Subject subject) {
//		mState = ((ConcretSubject) subject).getState();
//		System.out.println("״̬ mState = "+ mState);
	}
	@Override
	public void update(Observer observer) {
		mState = ((ConcretSubject) observer).getState();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		System.out.println("״̬ mState = "+ mState);		
	}
	@Override
	public void update(Observable observer, Object arg) {
		mState = ((ConcretSubject) observer).getState();
		System.out.println("״̬ mState = "+ mState);			
	}
}