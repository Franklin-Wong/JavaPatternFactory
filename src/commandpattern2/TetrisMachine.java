package commandpattern2;
/**
 * 具体执行类 相当于 Receiver
 */
public class TetrisMachine {
	
	public void toLeft(){
		System.out.println("向左");
	}
	public void toRight(){
		System.out.println("向右");
	}
	public void toFall(){
		System.out.println("快速落下");
	}
	public void toTansform(){
		System.out.println("改变形状");
	}
}
