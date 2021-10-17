package mediatorpattern2;

public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void palySound(String data){
		System.out.println("������Ƶ : "+data);
	}
}
