package observerpattern;

import java.util.Observable;

public class TechFrontier extends Observable{

	public void postNews(String arg){
		//��ʶ״̬�����߸ı�
		setChanged();
		//֪ͨ���еĹ۲���
		notifyObservers(arg);
	}
	
}
