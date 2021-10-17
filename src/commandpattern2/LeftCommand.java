package commandpattern2;

public class LeftCommand implements Command{

	private TetrisMachine mTetrisMachine;
	
	public LeftCommand(TetrisMachine mTetrisMachine) {
		this.mTetrisMachine = mTetrisMachine;
	}

	@Override
	public void execute() {
		mTetrisMachine.toLeft();
	}

}
