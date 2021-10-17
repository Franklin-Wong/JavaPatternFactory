package commandpattern;

public class ConcretCommand implements Command{

	private Receiver mReceiver;
	
	public ConcretCommand(Receiver mReceiver) {
		this.mReceiver = mReceiver;
	}

	@Override
	public void execute() {
		mReceiver.action();
	}

}
