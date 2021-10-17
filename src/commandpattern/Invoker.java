package commandpattern;

public class Invoker {

	private Command mCommand;

	public Invoker(Command mCommand) {
		this.mCommand = mCommand;
	}
	public void action(){
		mCommand.execute();
	}
}
