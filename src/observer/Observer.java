package observer;

public interface Observer {
	void update(Subject obj);
	void update(Observer observer);
}
