package commandpattern2;

public class RightCommand implements Command{

	private TetrisMachine mTetrisMachine;
	
	public RightCommand(TetrisMachine mTetrisMachine) {
		this.mTetrisMachine = mTetrisMachine;
	}

	@Override
	public void execute() {
		mTetrisMachine.toRight();
	}

}
