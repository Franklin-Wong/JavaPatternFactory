package commandpattern2;
/**
 * Ïàµ±ÓÚ Invoker
 */
public class Buttons {
	
	private Command mLeftCommand;
	private Command mRightCommand;
	
	public void setRightCommand(RightCommand command){
		mRightCommand = command;
	}

	public void setLeftCommand(LeftCommand command){
		mLeftCommand = command;
	}

	public void toLeft(){
		mLeftCommand.execute();
	}
	public void toRight(){
		mRightCommand.execute();
	}

}
