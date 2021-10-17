package momentopatttern;
/**
 * �൱�� originator
 */
public class CallOfDutyGame {

	private int mCheckPoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "ɳĮ֮ӥ";
	/**
	 * ����Ϸ
	 */
	public void play(){
		System.out.println("��ʼ����Ϸ-------" + this);
		mLifeValue -=10;
		mCheckPoint++;
		System.out.println("��ʼ����Ϸ ���Ա仯=  "+this.toString());
			
	}
	/**
	 * �˳���Ϸ
	 */
	public void quit(){
		System.out.println("�˳���Ϸ--------"+this.toString());
	}
	/**
	 * ��������¼
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
	 * �ָ���Ϸ
	 * @param memoto
	 */
	public void restore(Memoto memoto){
		mCheckPoint = memoto.mCheckPoint;
		mLifeValue = memoto.mLifeValue;
		mWeapon = memoto.mWeapon;
		System.out.println("�ָ������Ϸ����" + this.toString());
		
	}
	@Override
	public String toString() {
		return "CallOfDutyGame [mCheckPoint=" + mCheckPoint + ", mLifeValue="
				+ mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
	
	
}
