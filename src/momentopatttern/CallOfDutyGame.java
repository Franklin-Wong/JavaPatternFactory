package momentopatttern;
/**
 * 相当于 originator
 */
public class CallOfDutyGame {

	private int mCheckPoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "沙漠之鹰";
	/**
	 * 玩游戏
	 */
	public void play(){
		System.out.println("开始玩游戏-------" + this);
		mLifeValue -=10;
		mCheckPoint++;
		System.out.println("开始玩游戏 属性变化=  "+this.toString());
			
	}
	/**
	 * 退出游戏
	 */
	public void quit(){
		System.out.println("退出游戏--------"+this.toString());
	}
	/**
	 * 创建备忘录
	 * @return
	 */
	public Memoto creatMemotoeMemoto(){
		Memoto memoto = new Memoto();
		memoto.mCheckPoint = mCheckPoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}
	/**
	 * 恢复游戏
	 * @param memoto
	 */
	public void restore(Memoto memoto){
		mCheckPoint = memoto.mCheckPoint;
		mLifeValue = memoto.mLifeValue;
		mWeapon = memoto.mWeapon;
		System.out.println("恢复后的游戏属性" + this.toString());
		
	}
	@Override
	public String toString() {
		return "CallOfDutyGame [mCheckPoint=" + mCheckPoint + ", mLifeValue="
				+ mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
	
	
}
